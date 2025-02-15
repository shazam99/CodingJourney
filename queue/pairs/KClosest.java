package queue.pairs;

import java.security.KeyPair;
import java.util.*;

public class KClosest {
    public static void main(String[] args) {
        int k = 3;
        int x = 7;
        List<Integer> result = kClosest(new int[]{5,6,7,8,9}, k, x);
        System.out.println(result);

        Map.Entry<Integer, Integer> entry4 = new AbstractMap.SimpleEntry<>(4, 4);
        Map.Entry<Integer, Integer> entry1 = new AbstractMap.SimpleEntry<>(1, 3);
        Map.Entry<Integer, Integer> entry3 = new AbstractMap.SimpleEntry<>(3, 1);
        Map.Entry<Integer, Integer> entry2 = new AbstractMap.SimpleEntry<>(2, 2);


        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
                Map.Entry.comparingByValue(Comparator.reverseOrder())
        );
        pq.offer(entry2);
        pq.offer(entry1);
        pq.offer(entry3);
        pq.offer(entry4);

        System.out.println(pq.poll().getKey());




    }

    private static List<Integer> kClosest(int[] arr, int k, int x) {

        return null;
    }


}

