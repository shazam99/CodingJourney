package Searching.BinarySearch;

public class SearchInRotatedSortedArray{

     // Leetcode 33 Medium
     // Input: arr = [4,5,6,7,0,1,2], target = 0
     // Output: 4
     public static void main(String[] args) {
          int[] arr = new int[]{4,5,6,7,0,1,2};
          int target = 0;
          int output = rotatedBinarySearch(arr,target);
          System.out.println("Output: " + output);
     }
     public static int rotatedBinarySearch(int[] arr, int target){
          int s = 0;
          int e = arr.length -1;
          int mid;
          while(s<=e){
               mid = s+ (e-s)/2;

               if (arr[mid] == target) {
                    return mid;
               }
               if (arr[mid] > arr[s] ) { // Left Side is sorted
                    if (arr[s] <= target && target < arr[mid]){
                         e = mid-1;
                    }else{
                         s = mid+1;
                    }
               } else{ // Right Side is sorted
                    if (arr[mid] < target && target <= arr[e]){
                         s = mid+1;
                    }else{
                         e = mid-1;
                    }
               }
          }
          return -1;
     }
}
