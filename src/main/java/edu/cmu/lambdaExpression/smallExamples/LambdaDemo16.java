package edu.cmu.lambdaExpression.smallExamples;

/**
 * @ClassName: LambdaDemo16 @Description: todo @Author Yuqi Du @Date 2021/11/3 6:01 下午 @Version 1.0
 */

// Demonstrate a constructor reference with a generic class.

// MyFunc is now a generic functional interface.
interface MyFunc5<T> {
  MyClass5<T> func(T n);
}

class MyClass5<T> {
  private T val;

  // A constructor that takes an argument.
  MyClass5(T v) {
    val = v;
  }

  // This is the default constructor.
  MyClass5() {
    val = null;
  }

  // ...

  T getVal() {
    return val;
  }
  ;
}

class ConstructorRefDemo2 {

  public static void main(String args[]) {
    // Create a reference to the MyClass<T> constructor.
    MyFunc5<Integer> myClassCons = MyClass5<Integer>::new;

    // Create an instance of MyClass<T> via that constructor reference.
    MyClass5<Integer> mc = myClassCons.func(100);

    // Use the instance of MyClass<T> just created.
    System.out.println("val in mc is " + mc.getVal());
  }
}
