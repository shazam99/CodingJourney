package LeetCodePatterns.SlidingWindow;

public class MaxSumInSubArraySizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 1, 3, 2};
        int k = 2;

        int maxSum = 0;
        int subArraySum = 0;

        // first window sum upto k
        for(int i=0; i<k; i++){
            subArraySum+=arr[i];
        }

        for(int i=k; i<arr.length; i++){
            subArraySum = subArraySum + arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, subArraySum);
        }

        System.out.println(maxSum);

    }
}
