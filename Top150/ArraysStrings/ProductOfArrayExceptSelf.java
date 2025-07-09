package Top150.ArraysStrings;

public class ProductOfArrayExceptSelf {

    // Method to calculate product of array except self without using division
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;  // Get length of input array
        int[] result = new int[n];  // This array will store our final answer

        // Step 1: Calculate product of elements to the left of current index
        // For the first element, there’s nothing on the left, so set it to 1
        result[0] = 1;

        // Loop through the array starting from index 1
        for (int i = 1; i < n; i++) {
            // result[i] should be product of all numbers to the left of i
            // So multiply previous result with previous number in input array
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate product of elements to the right of current index
        // And multiply it directly with left product stored in result[]

        // Initialize rightProduct as 1 because there’s nothing on the right of last element
        int rightProduct = 1;

        // Loop from end of array towards start
        for (int i = n - 1; i >= 0; i--) {
            // Multiply current result[i] (left product) with rightProduct (product of numbers to right)
            result[i] = result[i] * rightProduct;

            // Update rightProduct by multiplying it with current number
            // So it carries product of elements to the right of next index in next iteration
            rightProduct *= nums[i];
        }
        return result;
    }

    // Main method to test our solution
    public static void main(String[] args) {
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] output = obj.productExceptSelf(nums);
        for (int num : output) {
            System.out.print(num + " ");
        }
    }
}
