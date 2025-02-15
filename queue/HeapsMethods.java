package queue;

import java.util.*;

public class HeapsMethods {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(40);
        minHeap.offer(10);
        minHeap.offer(50);
        minHeap.offer(20);
        minHeap.offer(30);
        minHeap.offer(100);
        System.out.println("Min Heap: " + minHeap);


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.offer(40);
        maxHeap.offer(100);
        maxHeap.offer(50);
        maxHeap.offer(20);
        maxHeap.offer(30);
        maxHeap.offer(10);
        System.out.println("Max Heap: " + maxHeap);



    }

}
