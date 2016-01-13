package com.getinthecloud.app;

/**
 * Created by davicres on 13/01/2016.
 */
public final class Concurrency {

    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };
        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");
    }


}
