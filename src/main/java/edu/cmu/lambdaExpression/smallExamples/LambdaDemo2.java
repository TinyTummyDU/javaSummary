package edu.cmu.lambdaExpression.smallExamples;

/**
 * @ClassName: LambdaDemo2 @Description: todo @Author Yuqi Du @Date 2021/11/3 3:41 下午 @Version 1.0
 */
// Another functional interface.
interface NumericTest {
  boolean test(int n);
}

class LambdaDemo2 {
  public static void main(String args[]) {
    // A lambda expression that tests if a number is even.
    NumericTest isEven = (int n) -> (n % 2) == 0;
    //      NumericTest isEven = (n) -> (n % 2) == 0;

    if (isEven.test(10)) System.out.println("10 is even");
    if (!isEven.test(9)) System.out.println("9 is not even");

    // Now, use a lambda expression that tests if a number
    // is non-negative.
    NumericTest isNonNeg = (n) -> n >= 0;

    if (isNonNeg.test(1)) System.out.println("1 is non-negative");
    if (!isNonNeg.test(-1)) System.out.println("-1 is negative");
  }
}
