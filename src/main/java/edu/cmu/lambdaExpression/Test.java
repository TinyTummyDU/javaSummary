package edu.cmu.lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @ClassName: Test
 * @Description: todo
 * @Author Yuqi Du
 * @Date 2021/12/1 11:32 下午
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        String s ="hello";
        Function<String, Integer> function = Test::cassie;


        System.out.println(function.apply(s));


        char[] chars = {1,2,3};
        Consumer<char[]> consumer = (a)->{
            a[0]= '4';
        };
        consumer.accept(chars);
        System.out.println(chars[0]);
        System.out.println(111);

    }


    public static Integer cassie(String a){
        return 1;
    }
}