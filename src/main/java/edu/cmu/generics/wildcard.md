

## [通配符](https://www.zhihu.com/search?q=通配符&search_source=Entity&hybrid_search_source=Entity&hybrid_search_extra={"sourceType"%3A"answer"%2C"sourceId"%3A1865592971})

？在Java泛型中表示通配符，代表任意类型，例如有如下方法

```text
public void method(List<?>list){
    for (Object o : list) {
        System.out.println(o);
    }
}
```

那么我们可以给方法入参传入什么值呢？

答案是任意类型的List： List<String>, List<Integer>,甚至于List<Object> 。当你在方法中使用传入的值时问题就来了，因为无论你传入什么类型的List，从list取出来的对象编译时类型都是Object类型，这你能忍吗？这就导致你需要使用 **instanceof** 以及**类型强制转换**去获取实际类型，这你妈不就是泛型要解决的问题吗，怎用了泛型还是这吊样，那与直接使用List 有毛区别？于是 

```text
<? extends T> 
```

和

```text
<? super T>
```

这哥俩就粉墨登场了

假设有如下两个类

```text
public class Parent {
}

public class Son extends Parent {
}
```

### 通配符上界

通配符上界使用**<? extends T>**的格式，意思是需要一个**T类型**或者**T类型的子类**，一般T类型都是一个具体的类型，例如下面的代码。

```text
public void testExtends(List<? extends Parent> list) {
    for (Parent parent : list) {
       //list 提供值
    }
    // list.add("这里无法传入具体的类型，因为我们不知道有哪些类继承了Parent");
    // <? extends Parent> list只能提供值，我们不能消费list,即不能修改list
}
```

这个意义就非凡了，无论传入的是何种类型的集合，我们都可以使用其父类的方法统一处理。

### 通配符下界

通配符下界使用**<? super T>**的格式，意思是需要一个**T类型**或者**T类型的父类**，一般T类型都是一个具体的类型，例如下面的代码。

```text
public void testSuper(List<? super Son> list) {
    for (Object o : list) {
        // o 只能是Object类型，所以可以认为list不能提供值，因为提供的值拿不到类型
    }
    list.add(new Son());//list只能被消费，即修改list
}
```



我们可以使用下面的代码测试上面的两个方法：

```text
public void test() {
    List<Son> sonList = new ArrayList<>();
    testExtends(sonList);
    List<Parent> parentList = new ArrayList<>();
    testSuper(parentList);
}
```



### PECS

至于什么时候使用通配符上界，什么时候使用下界，在《Effective Java》中有很好的指导意见：

遵循**PECS**原则，即producer-extends,consumer-super. 换句话说，如果参数化类型表示一个生产者，就使用 <? extends T>；如果参数化类型表示一个消费者，就使用<? super T>。

再深入一点的话就应该了解协变逆变以及抗变的概念了，明白后你会对上面的原则有非常清晰的认识

建议阅读下面两篇文章，当然也是偶写的拉，觉得好请不吝赐赞啊



java是单继承，所有继承的类构成一棵树。

假设A和B都在一颗继承树里（否则super，extend这些词没意义）。

A super B 表示A是B的父类或者祖先，在B的上面。

A extend B 表示A是B的子类或者子孙，在B下面。

由于树这个结构上下是不对称的，所以这两种表达区别很大。假设有两个泛型写在了函数定义里，作为函数形参（形参和实参有区别）：

\1) 参数写成：T<? super B>，对于这个泛型，?代表容器里的元素类型，由于只规定了元素必须是B的超类，导致元素没有明确统一的“根”（除了Object这个必然的根），所以这个泛型你其实无法使用它，对吧，除了把元素强制转成Object。所以，对把参数写成这样形态的函数，你函数体内，只能对这个泛型做**插入操作，而无法读**

\2) 参数写成： T<? extends B>，由于指定了B为所有元素的“根”，你任何时候都可以安全的用B来使用容器里的元素，但是插入有问题，由于供奉B为祖先的子树有很多，不同子树并不兼容，由于实参可能来自于任何一颗子树，所以你的插入很可能破坏函数实参，所以，对这种写法的形参，**禁止做插入操作，只做读取**