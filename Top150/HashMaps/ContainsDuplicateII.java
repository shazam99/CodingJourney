package Top150.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    // 219. Contains Duplicate II
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 0, 1, 1 };
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}