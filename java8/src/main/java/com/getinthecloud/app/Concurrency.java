package com.getinthecloud.app;

import java.util.concurrent.TimeUnit;

/**
 * Created by davicres on 13/01/2016.
 */
public final class Concurrency {



    public static void main(String[] args) {
        concurrency(2);
    }

    private static void concurrency(int option) {
        switch (option) {
            case 1: normalConcurrentTask();
            case 2: concurrentTaskPutToSleep();
        }
    }

    private static void concurrentTaskPutToSleep() {
        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    private static void normalConcurrentTask() {
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
