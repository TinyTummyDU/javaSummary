package edu.cmu.multiThread.waysOfCreatingThreads;

public class ClassImplementsRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("run");
    }

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable with Anonymous Class");
            }
        };

        Runnable r2 = ()->{
            System.out.println("Runnable with lambda expression");
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
