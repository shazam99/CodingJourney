package Top150.HashMaps;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    // 128. Longest Consecutive Sequence
    public static void main(String[] args) {
        int[] nums = new int[] { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int max = 0;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int tempMax = 1;
                while (set.contains(i + 1)) {
                    tempMax++;
                    i++;
                }
                max = Math.max(max, tempMax);
            }
        }
        return max;
    }
}
