package edu.cmu.multiThread.waysOfCreatingThreads;

import java.util.function.Consumer;
import java.util.function.Function;

public class ClassExtendsThread extends Thread {

    //还是用Runnable好，因为这样会占用 extends


    public static void main(String[] args) {
        Thread t1 = new ClassExtendsThread();
        t1.start();

    }

    @Override
    public void run() {
//        xxxxxx
    }
}
