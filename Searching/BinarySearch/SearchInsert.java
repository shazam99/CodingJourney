package Searching.BinarySearch;

public class SearchInsert {
     // Leetcode 35 Easy
     // Input: nums = [1,3,5,6], target = 5
     // Output: 2
     public static void main(String[] args) {
          int[] nums = new int[]{1,3,5,6};
          int target = 5;
          int output = searchInsertIndex(nums, target);
          System.out.println(output);
     }
     public static int searchInsertIndex(int[] nums, int target){
          int start = 0;
          int end = nums.length -1;
          int ans = end+1;

          while(start<=end){
               int mid = start + (end-start)/2;

               if(nums[mid]>=target){
                    ans= mid;
                    end=mid-1;
               }else{
                    start = mid+1;
               }
          }
          return ans;
     }
}
