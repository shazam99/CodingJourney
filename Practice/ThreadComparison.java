package Practice;

import java.time.Instant;

public class ThreadComparison {
    public static void main(String[] args) {
        System.out.println("Starting Platform Threads at: " + Instant.now());

        // Platform Threads (High CPU & Memory usage)
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                System.out.println("[Platform Thread] " + Instant.now() + " - Running: " + Thread.currentThread());
            }).start();
        }

        System.out.println("Finished launching Platform Threads at: " + Instant.now());

        System.out.println("\nStarting Virtual Threads at: " + Instant.now());

        // Virtual Threads (Low CPU & Memory usage)
        for (int i = 0; i < 1000; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("[Virtual Thread] " + Instant.now() + " - Running: " + Thread.currentThread());
            });
        }

        System.out.println("Finished launching Virtual Threads at: " + Instant.now());
    }
}
