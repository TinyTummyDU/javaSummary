package edu.cmu.lambdaExpression.smallExamples;

/**
 * @ClassName: LambdaDemo4 @Description: todo @Author Yuqi Du @Date 2021/11/3 3:50 下午 @Version 1.0
 */
// A block lambda that computes the factorial of an int value.

interface NumericFunc {
  int func(int n);
}

class BlockLambdaDemo {
  public static void main(String args[]) {

    // This block lambda computes the factorial of an int value.
    NumericFunc factorial =
        (n) -> {
          int result = 1;

          for (int i = 1; i <= n; i++) result = i * result;

          return result;
        };

    System.out.println("The factoral of 3 is " + factorial.func(3));
    System.out.println("The factoral of 5 is " + factorial.func(5));
  }
}
