package edu.cmu.exception;

/**
 * @ClassName: Scope
 * @Description: todo
 * @Author Yuqi Du
 * @Date 2021/12/6 10:48 上午
 * @Version 1.0
 */
public class Scope {

    public static void main(String[] args) {
        try {
            System.out.println("Welcome to Java");
            int i = 0;
            double y = 2.0 / i;
            //tmd 有一个是double或者float 就是infinity
            System.out.println(y);
            System.out.println("Welcome to HTML");
        }catch (Exception e){
            System.out.println("cao");
        }finally{
            System.out.println("The finally clause is executed");
        }
    }
}
