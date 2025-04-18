package Top150;

import java.util.Arrays;

public class MergeTwoSortedArray {
    // 88. Merge Sorted Array
    public static void main(String[] args) {
        int[] num1 = new int[]{0};
        int[] num2 = new int[]{1};

        int m=0;
        int n=1;
        merge(num1,m,num2,n);
        System.out.println(Arrays.toString(num1));
    }
    public static void merge(int[] num1, int m, int[] num2, int n) {
        int i = m-1;    // last non-zero index of num1
        int j = n-1;    // last index of num2
        int k = n+m-1;  // last index of num1

        while(j>=0){    // Iterate over num2
            if(i>= 0 && num1[i]>num2[j]){   // check for empty num1
                num1[k] = num1[i];
                i--;
            }else{
                num1[k] = num2[j];
                j--;
            }
            k--;
        }
    }
}
