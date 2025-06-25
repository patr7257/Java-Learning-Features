package runApplication;

import Enums.Animals;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class StartApplication {
    public static void main(String[] args) throws InterruptedException {
            
        // one worker thread per animal type
        ExecutorService pool = buildPool(Animals.values().length);

        for (Animals t : Animals.values()) {
            pool.submit(new AnimalTask(t));
        }

        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("=== All animal tasks finished ===");
    }

    // Thread factory
    /** Builds a fixed-size pool whose threads are named "Thread 1", "Thread 2", … */
    private static ExecutorService buildPool(int size) {
        AtomicInteger counter = new AtomicInteger(1);

        ThreadFactory namedFactory = r ->
                new Thread(r, "Thread " + counter.getAndIncrement());

        return Executors.newFixedThreadPool(size, namedFactory);
    }
}
