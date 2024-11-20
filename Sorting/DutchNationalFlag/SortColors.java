package Sorting.DutchNationalFlag;

import java.util.Arrays;

public class SortColors {
    // Leetcode 75 Medium
    // Input: nums = [2,0,2,1,1,0]
    // Output: [0,0,1,1,2,2]
    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        solution(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static void solution(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length -1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(low,mid,nums);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(high,mid,nums);
                high--;
            }
        }
    }

    private static void swap(int first, int second, int[] nums) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
