package Practice;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Demo2 {
    public static int getTripletCount(List<Integer> arr, int d) {
        int n = arr.size();
        int count = 0;

        // prefix mod counts
        int[] modCounts = new int[d];

        for (int j = 0; j < n; j++) {
            // For every k > j
            for (int k = j + 1; k < n; k++) {
                int ms = (arr.get(j) + arr.get(k)) % d;
                int rm = (d - ms) % d;
                count += modCounts[rm];
            }

            // Update modCounts after processing j
            modCounts[arr.get(j) % d]++;
        }

        return count;
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,1,6);
        int d = 3;

        HashSet<Integer> set = new HashSet<>();
        set.add(null);
        set.add(1);
        set.add(2);
        ConcurrentHashMap<Integer, Integer> m = new ConcurrentHashMap<>();
//        m.put(null,1);
        m.put(5,5);
        m.put(6,6);
        System.out.println(m);

        System.out.println(set);
        int result = getTripletCount(list, d);
        System.out.println("Number of valid triplets: " + result);
    }

}
