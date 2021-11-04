package edu.cmu.lambdaExpression.methodReference;

/** @ClassName: TestUtil @Description: todo @Author Yuqi Du @Date 2021/11/3 6:45 下午 @Version 1.0 */
public class TestUtil {
  public static boolean isBiggerThan3(int input) {
    return input > 3;
  }

  public void printDetail(Student student) {
    System.out.println(student.toString());
  }
}
