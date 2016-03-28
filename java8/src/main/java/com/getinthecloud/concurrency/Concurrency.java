package com.getinthecloud.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by davicres on 13/01/2016.
 */
public final class Concurrency {



    public static void main(String[] args) {
        concurrency(3);

    }

    private static void executorService() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
    }

    private static void concurrency(int option) {
        switch (option) {
            case 1: normalConcurrentTask();break;
            case 2: concurrentTaskPutToSleep();break;
            case 3: executorService();break;

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
