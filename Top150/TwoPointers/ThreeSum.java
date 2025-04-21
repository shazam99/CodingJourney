package Top150.TwoPointers;

import java.util.*;

public class ThreeSum {
    // 15. 3Sum
    public static void main(String[] args) {
        int[] nums = new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--;

                } else if (sum < 0) {
                    j++;

                } else {
                    if (!set.contains(List.of(nums[i], nums[j], nums[k]))) {
                        set.add(List.of(nums[i], nums[j], nums[k]));
                        list.add(List.of(nums[i], nums[j], nums[k]));
                    }
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
            }
        }
        return list;

    }
}
