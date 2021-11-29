package edu.cmu.collection;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueue0 {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue1 =
                new PriorityQueue<Integer>(
                        Arrays.asList(60, 10, 50, 30, 40, 20));
        for (int i: queue1)
            System.out.print(i + " ");
        System.out.println();

        PriorityQueue<Integer> queue =
                new PriorityQueue<Integer>(
                        Arrays.asList(60, 10, 50, 30, 40, 20));

        while (!queue.isEmpty())
            System.out.print(queue.poll() + " ");


    }
}
