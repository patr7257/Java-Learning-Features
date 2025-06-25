package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DemoExecutor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 3; i++) {
            pool.submit(new MultiThreading(i));
        }

        pool.shutdown();                        // stop accepting new tasks
        pool.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Pool finished!");
    }
}
