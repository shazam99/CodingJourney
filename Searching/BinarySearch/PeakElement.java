package Searching.BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1 };
        System.out.println(solve(arr));
    }

    private static int solve(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return mid;
                } else if (arr[mid] < arr[mid + 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else if(mid == 0){
                if(arr[mid] > arr[mid+1]){
                    return mid;
                }return mid+1;
            }
            else if(mid == arr.length-1){
                if (arr[mid] > arr[mid - 1]) {
                    return mid;
                }
                return mid - 1;
            }
        }
        return -1;
    }

}
