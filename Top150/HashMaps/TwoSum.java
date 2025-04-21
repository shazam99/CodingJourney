package Top150.HashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // 1. Two sum
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[]{-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        // set   <element , Index>
        // find  <target - element , Index>
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) { // finding key
                result[0] = map.get(target - nums[i]); // value
                result[1] = i; //index
                break;
            } else {
                map.put(nums[i], i);  // element ,index
            }
        }
        return result;
    }
}
