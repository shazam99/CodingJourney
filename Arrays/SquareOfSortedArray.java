package Arrays;

import java.util.Arrays;

public class SquareOfSortedArray {
    // Leetcode 977 Easy
    // Input: nums = [-4,-1,0,3,10]
    // Output: nums = [0,1,9,16,100]

    public static void main(String[] args) {
        int[] nums = new int[]{-7,-3,2,3,11};
        int[] res = new int[nums.length];

        int s = 0;
        int e = nums.length -1;

        for(int i=res.length-1; i>=0; i--){
            if(Math.abs(nums[s]) < Math.abs(nums[e])){
                res[i] = nums[e]*nums[e];
                e--;
            }else{
                res[i] = nums[s]*nums[s];
                s++;
            }
        }
        System.out.println(Arrays.toString(res));

    }
}
