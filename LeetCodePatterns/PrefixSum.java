package LeetCodePatterns;

import java.util.HashMap;
import java.util.Map;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,7,8,3,1,1};
        int k = 8;
        int count = solve(arr, k);
        System.out.println(count);
    }

    private static int solve(int[] arr, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0,1);

        int count = 0;
        int prefixSum = 0;

        for(int num: arr){
            prefixSum+=num;
            if(prefixSumMap.containsKey(prefixSum - k)){
                count+=prefixSumMap.get(prefixSum - k);
            }
            prefixSumMap.put(prefixSum , prefixSumMap.getOrDefault(prefixSum ,0 ) + 1);
        }

        return count;
    }
}
