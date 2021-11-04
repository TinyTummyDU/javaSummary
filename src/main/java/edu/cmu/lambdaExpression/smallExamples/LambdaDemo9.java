package edu.cmu.lambdaExpression.smallExamples;

/**
 * @ClassName: LambdaDemo9 @Description: todo @Author Yuqi Du @Date 2021/11/3 4:05 下午 @Version 1.0
 */
// An example of capturing a local variable from the enclosing scope.

interface MyFunc2 {
  int func(int n);
}

class VarCapture {
  public static void main(String args[]) {
    // A local variable that can be captured.
    int num = 10;

    MyFunc2 myLambda =
        (n) -> {
          // This use of num is OK. It does not modify num.
          int v = num + n;

          // However, the following is illegal because it attempts
          // to modify the value of num.
          //    num++;

          return v;
        };

    // The following line would also cause an error, because
    // it would remove the effectively final status from num.
    //      java: 从lambda 表达式引用的本地变量必须是最终变量或实际上的最终变量
    //    num = 9;
    System.out.println(myLambda.func(2));
  }
}
