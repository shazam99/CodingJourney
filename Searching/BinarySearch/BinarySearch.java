package Searching.BinarySearch;

public class BinarySearch {

     // Leetcode 704 Easy
     // Input: nums = [-1,0,3,5,9,12], target = 9
     //          index =     0,1,2,3,4,5
     // Output: 4
     public static void main(String[] args) {
          int[] nums = new int[]{-1,0,3,5,9,12};
          int target = 9;
          int output = binarySearch(nums, target);
          System.out.println(output);
     }

     public static int binarySearch(int[] nums, int target){
          int start = 0;
          int end  = nums.length -1;
          int mid;
          while(start <= end){
               mid = start + (end-start)/2;

               if(target == nums[mid]){
                    return mid;
               }
               if (target > nums[mid]){
                    start = mid+1;
               }else{
                    end = mid-1;
               }
          }
          return -1;
     }
}
