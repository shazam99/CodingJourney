package Top150.ArraysStrings;

import java.util.Arrays;

public class RemoveElement {
    // 27. Remove Element
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
        System.out.println(Arrays.toString(nums));
    }
    public static int removeElement(int[] nums, int val) {
        int index = 0;                 // maintain count of non-val elements
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[index]=nums[i];   // to replace current index with non-val element
                index++;
            }
            System.out.println(Arrays.toString(nums));
        }
        return index;
    }
}
