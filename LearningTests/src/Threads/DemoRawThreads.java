package Threads;

public class DemoRawThreads {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new MultiThreading(1));
        Thread t2 = new Thread(new MultiThreading(2));
        Thread t3 = new Thread(new MultiThreading(3));

        t1.start();
        t2.start();
        t3.start();

        // Wait for all three to finish before exiting
        t1.join();
        t2.join();
        t3.join();

        System.out.println("All workers done!");
    }
}
