package edu.cmu.lambdaExpression.smallExamples;

/**
 * @ClassName: LambdaDemo3 @Description: todo @Author Yuqi Du @Date 2021/11/3 3:46 下午 @Version 1.0
 */

// Demonstrate a lambda expression that takes two parameters.

interface NumericTest2 {
  boolean test(int n, int d);
}

class LambdaDemo3 {
  public static void main(String args[]) {
    // This lambda expression determines if one number is
    // a factor of another.
    //        NumericTest2 isFactor = (n, d) -> (n % d) == 0;
    //        NumericTest2 isFactor = (int n, int d) -> (n % d) == 0;
    NumericTest2 isFactor =
        (int n, int d) -> {
          return ((n % d) == 0);
        };

    if (isFactor.test(10, 2)) System.out.println("2 is a factor of 10");

    if (!isFactor.test(10, 3)) System.out.println("3 is not a factor of 10");
  }
}
