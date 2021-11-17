package edu.cmu.multiThread.waysOfCreatingThreads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingThreadPool {

    public static void main(String[] args) {
        // create a fixed thread pool with maximum three threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        //submit runnable tasks to the executor
        executor.execute(new ClassExtendsThread());
        executor.execute(new ClassExtendsThread());
        executor.execute(new ClassExtendsThread());

        //pool 会 reuse thread,你不用一直重新创建线程

        executor.shutdown();
    }
}
