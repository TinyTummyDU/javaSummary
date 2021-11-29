package edu.cmu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list0 {


    public static void main(String[] args) {
        System.out.println("Jill".compareTo("Peter"));
        System.out.println("Peter".compareTo("Sarah"));
        
    }


    public static void test1(){
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(1);
//        list.remove(new Integer(1));

        for(Integer i : list){
            System.out.println(i);
        }


    }
}
