package edu.cmu.multiThread.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSync {

    //这种就是 不 thread-safe

    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        // Create and launch 100 threads
        for (int i = 0; i < 100; i++) {

            executor.execute(new AddAPennyThread());
        }
        executor.shutdown();
        // Wait until all tasks are finished
        while (!executor.isTerminated()) {
        }
        System.out.println("What is balance ? " + account.getBalance());
    }

    // A thread for adding a penny to the account
    private static class AddAPennyThread implements Runnable {
        public void run() {
            account.deposit(1);
        }
    }

    // An inner class for account
    private static class Account {
        private int balance = 0;

        public int getBalance() {
            return balance;
        }

        public void deposit(int amount) {
            int newBalance = balance + amount;
            // This delay is deliberately added to magnify the
            // data-corruption problem and make it easy to see.
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
            }
            balance = newBalance;
        }

    }

}
