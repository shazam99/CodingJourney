package Top150.TwoPointers;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {
    // 167. Two Sum II - Input Array Is Sorted
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 22;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        while(s<=e){ // Simple 2 pointers
            int sum = nums[s] + nums[e];
            if(sum == target){
                return new int[]{s,e};
            } else if (sum>target) {
                e--;
            }else{
                s++;
            }
        }
        return new int[2];
    }
}
