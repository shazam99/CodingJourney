package Practice;

import java.util.Arrays;

public class ArrangeNegativeToLeft {
    // Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
    // Output: -12 -13 -5 -7 -3 -6 11 6 5
    public static void main(String[] args) {
        int[] arr = new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6};

        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
