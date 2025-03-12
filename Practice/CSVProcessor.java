package Practice;

import java.util.concurrent.*;

public class CSVProcessor {
    private static final int THREAD_COUNT = 100;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            int chunk = i;
            executor.submit(() -> processChunk(chunk));
        }

        executor.shutdown();
    }

    private static void processChunk(int chunk) {
        System.out.println("Processing chunk: " + chunk + " by " + Thread.currentThread().getName());
        // Simulate processing
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

