package edu.cmu.generics;

import java.util.Date;

/**
 * @ClassName: GenericTest
 * @Description: todo
 * @Author Yuqi Du
 * @Date 2021/12/2 10:07 下午
 * @Version 1.0
 */
public class GenericTest {

    public static void main(String[] args) {


        //现在是在实例化，给什么，后面就要跟什么

        Comparable<String> a = "123";
        Comparable<Date> b = new Date();
//        Comparable<Object> c = new Date();
//        Comparable<Object> d = "asd";
    }
}
