package edu.cmu.lambdaExpression.methodReference;

/** @ClassName: Student @Description: todo @Author Yuqi Du @Date 2021/11/3 6:44 下午 @Version 1.0 */
public class Student {
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getStatus(String thing) {
    return String.format("%d岁的%s正在%s", age, name, thing);
  }

  @Override
  public String toString() {
    return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
}
