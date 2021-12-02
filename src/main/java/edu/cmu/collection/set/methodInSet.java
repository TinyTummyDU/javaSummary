package edu.cmu.collection.set;

import java.util.*;

/**
 * @ClassName: methodInSet
 * @Description: todo
 * @Author Yuqi Du
 * @Date 2021/12/2 5:55 下午
 * @Version 1.0
 */
public class methodInSet {

    public static void main(String[] args) {


        //1 retain:Retains only the elements in this set that are contained in the specified collection (optional operation).
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.retainAll(Arrays.asList(new Integer[]{2, 3}));
//        set.retainAll(Arrays.asList(new int[]{2, 3})); 这个是不行的
        System.out.println(set);


        //2 set相等

//        set.equals();
//        Compares the specified object with this set for equality.
//                Returns true if the specified object is also a set, the two sets have the same size, and every member of
//        the specified set is contained in this set (or equivalently, every member of this set is contained in the specified set)

        //3 arraylist内部元素的equals和hashset内部元素的euqals

//         发现test1()中，ArrayList只根据equals()来判断两个对象是否相等，而不管hashCode是否不相等。
//        而test2()中，HashSet判断流程则不一样，①先判断两个对象的hashCode方法是否一样；
//        ②如果不一样，立即认为两个对象equals不相等，并不调用equals方法；③当hashCode相等时，再根据equals方法判断两个对象是否相等。
//        所以为了避免出现问题，我们还是应该坚持 equals 和 hashcode同步的原则



    }
}
