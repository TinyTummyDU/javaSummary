package edu.cmu.lambdaExpression.smallExamples;

/**
 * @ClassName: LambdaDemo14 @Description: todo @Author Yuqi Du @Date 2021/11/3 5:53 下午 @Version 1.0
 */
import java.util.ArrayList;
import java.util.Collections;

class MyClass0 {
  private int val;

  MyClass0(int v) {
    val = v;
  }

  int getVal() {
    return val;
  }
}

// Use a method reference to help find the maximum value in a collection.
class UseMethodRef {
  // A compare() method compatible with the one defined by Comparator<T>.
  static int compareMC(MyClass0 a, MyClass0 b) {
    return a.getVal() - b.getVal();
  }

  public static void main(String args[]) {
    ArrayList<MyClass0> al = new ArrayList<MyClass0>();

    al.add(new MyClass0(1));
    al.add(new MyClass0(4));
    al.add(new MyClass0(2));
    al.add(new MyClass0(9));
    al.add(new MyClass0(3));
    al.add(new MyClass0(7));

    // Find the maximum value in al using the compareMC() method.
    MyClass0 maxValObj = Collections.max(al, UseMethodRef::compareMC);

    System.out.println("Maximum value is: " + maxValObj.getVal());
  }
}
