package Threads;


public class MultiThreading implements Runnable {

    private final int threadNumber;

    public MultiThreading(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        // Give each worker a readable name in the log
        String label = "Thread " + threadNumber;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d from %s%n", i, label);

            try {
                Thread.sleep(1_000);          // 1-second pause
            } catch (InterruptedException e) {
                // Restore the interrupt flag and exit early
                Thread.currentThread().interrupt();
                System.out.println(label + " interrupted — stopping early");
                return;
            }
        }
    }
}
