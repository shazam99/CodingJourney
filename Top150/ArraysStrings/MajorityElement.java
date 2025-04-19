package Top150.ArraysStrings;

public class MajorityElement {
    // 169. Majority Element
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2, 3, 3, 3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;

    }
}
