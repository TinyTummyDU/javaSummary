package edu.cmu.lambdaExpression.smallExamples;

/**
 * @ClassName: LambdaDemo15 @Description: todo @Author Yuqi Du @Date 2021/11/3 5:58 下午 @Version 1.0
 */

// Demonstrate a Constructor reference.

// MyFunc is a functional interface whose method returns
// a MyClass reference.
interface MyFunc4 {
  MyClass4 func(int n);
}

class MyClass4 {
  private int val;

  // This constructor takes an argument.
  MyClass4(int v) {
    val = v;
  }

  // This is the default constructor.
  MyClass4() {
    val = 0;
  }

  // ...

  int getVal() {
    return val;
  }
  ;
}

class ConstructorRefDemo {
  public static void main(String args[]) {
    // Create a reference to the MyClass constructor.
    // Because func() in MyFunc takes an argument, new
    // refers to the parameterized constructor in MyClass,
    // not the default constructor.
    MyFunc4 myClassCons = MyClass4::new;

    // Create an instance of MyClass via that constructor reference.
    MyClass4 mc = myClassCons.func(100);

    // Use the instance of MyClass just created.
    System.out.println("val in mc is " + mc.getVal());
  }
}
