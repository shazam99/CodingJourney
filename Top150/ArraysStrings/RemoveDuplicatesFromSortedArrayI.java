package Top150.ArraysStrings;

public class RemoveDuplicatesFromSortedArrayI {
    // 26. Remove Duplicates from Sorted Array
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int j=1; // J tracks unique elements
        for(int i=0; i<nums.length; i++){
            if(nums[i] != nums[j-1]){ // if adjacent are not equal only then update
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
