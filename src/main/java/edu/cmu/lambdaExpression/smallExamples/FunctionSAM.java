package edu.cmu.lambdaExpression.smallExamples;

import java.util.function.Function;

/**
 * @ClassName: FunctionSAM
 * @Description: todo
 * @Author Yuqi Du
 * @Date 2021/11/19 4:33 下午
 * @Version 1.0
 */
public class FunctionSAM {

    public static void main(String[] args) {


        //self-made method reference (static method)
        Function<String,Integer> function = FunctionSAM::stringLength;
        System.out.println(deal(function,"Hello"));


        //build-in method  reference
        System.out.println(deal(String::length,"Hello"));


        //lambda
        System.out.println(deal( (String e)-> {return e.length();},"Hello"));
        System.out.println(deal( (String e)-> e.length(),"Hello"));


        //
        System.out.println(deal( (String e)-> {return stringLength(e);},"Hello"));
        System.out.println(deal( (String e)-> stringLength(e),"Hello"));


    }

    public static <T,R> R deal(Function<T,R> function, T t ){
        return function.apply(t);
    }

    public static Integer stringLength(String s){
        return s.length();
    }
}
