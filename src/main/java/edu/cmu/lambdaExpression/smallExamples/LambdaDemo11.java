package edu.cmu.lambdaExpression.smallExamples;

/**
 * @ClassName: LambdaDemo11 @Description: todo @Author Yuqi Du @Date 2021/11/3 4:13 下午 @Version 1.0
 */

// Demonstrate a method reference to an instance method

// A functional interface for string operations.
interface StringFunc1 {
  String func(String n);
}

// Now, this class defines an instance method called strReverse().
class MyStringOps1 {
  String strReverse(String str) {
    String result = "";
    int i;

    for (i = str.length() - 1; i >= 0; i--) result += str.charAt(i);

    return result;
  }
}

class MethodRefDemo2 {

  // This method has a functional interface as the type of
  // its first parameter. Thus, it can be passed any instance
  // of that interface, including method references.
  static String stringOp(StringFunc1 sf, String s) {
    return sf.func(s);
  }

  public static void main(String args[]) {
    String inStr = "Lambdas add power to Java";
    String outStr;

    // Create a MyStringOps object.
    MyStringOps1 strOps = new MyStringOps1();

    // Now, a method reference to the instance method strReverse
    // is passed to stringOp().
    outStr = stringOp(strOps::strReverse, inStr);

    System.out.println("Original string: " + inStr);
    System.out.println("String reversed: " + outStr);
  }
}
