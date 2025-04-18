package Top150;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {
    // 80. Remove Duplicates from Sorted Array
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
    int index = 0;
    for(int num: nums){
        if(index<2 || num!=nums[index-2]){ // leave first 2 elements as it is
            nums[index++] = num;           // replace index only if index != index-2
        }
    }
    return index;
    }
}
