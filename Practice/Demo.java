package Practice;

import java.util.ArrayList;
import java.util.List;

class Demo {

    /**
     * Finds duplicate elements in the given array.
     *
     * @param nums the array of integers to check for duplicates
     * @return a list of duplicate integers found in the array
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        int currentIndex = 0;
        while (currentIndex < nums.length) {
            int correctIndex = nums[currentIndex] - 1;
            // Swap elements to their correct positions
            if (nums[currentIndex] != nums[correctIndex]) {
                swap(nums, correctIndex, currentIndex);
            } else {
                currentIndex++;
            }
        }

        // Collect duplicates
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                duplicates.add(nums[i]);
            }
        }

        return duplicates;
    }

    /**
     * Swaps the elements at the specified positions in the given array.
     *
     * @param nums the array in which to swap elements
     * @param firstIndex the index of one element to be swapped
     * @param secondIndex the index of the other element to be swapped
     */
    private void swap(int[] nums, int firstIndex, int secondIndex) {
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
}



