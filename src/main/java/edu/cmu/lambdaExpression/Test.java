package edu.cmu.lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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

        Predicate<Integer> predicate = e->e>2;;
        Predicate<Integer> predicate1 = e->e>2;
        Consumer<String> consumer1 = e->{e.getBytes();};
        Consumer<String> consumer2 = e->e.getBytes();;
        Consumer<String> consumer3 = e->e.getBytes();


        Integer integer = 1;
        Function<Integer,String> function1 = (i)->{return "h"+i;};
        Consumer<String> consumer4 = e-> {System.out.println(e);};


        Function<Integer,String> function2 = (Integer i)->String.valueOf(i);;

        Function<Integer,String> function5 =  (i)->{return String.valueOf(i);};
        Function<Integer,String> function6 =  (i)->{
            return String.valueOf(i);
        };

        Function<Integer,String> function3 = (Integer i)-> "h"+ i;;
        Function<Integer,String> function4 = (Integer i)-> "h"+ i;



    }


    public static Integer cassie(String a){
        return 1;
    }
}
