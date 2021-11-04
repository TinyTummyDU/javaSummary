package edu.cmu.lambdaExpression.smallExamples;

/**
 * @ClassName: LambdaDemo5 @Description: todo @Author Yuqi Du @Date 2021/11/3 3:51 下午 @Version 1.0
 */
// A block lambda that reverses the characters in a string.

class BlockLambdaDemo2 {
  public static void main(String args[]) {

    // This block lambda that reverses the charactrers in a string.
    org.cmu.lambda.StringFunc reverse =
        (str) -> {
          String result = "";
          int i;

          for (i = str.length() - 1; i >= 0; i--) result += str.charAt(i);

          return result;
        };

    System.out.println("Lambda reversed is " + reverse.func("Lambda"));
    System.out.println("Expression reversed is " + reverse.func("Expression"));
  }
}
