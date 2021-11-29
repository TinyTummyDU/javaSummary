package edu.cmu.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {


    public static void main(String[] args) {

    }




    public void test1(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.remove(i));
        //AC
        //list.size() 每一次循环都会算一次
    }
}
