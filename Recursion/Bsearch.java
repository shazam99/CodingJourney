package Recursion;


public class Bsearch{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;

        System.out.println(bs(0, arr.length-1, target, arr));
    }

    public static int bs(int start, int end, int target, int[] arr){

        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(target> arr[mid]){ // right search
            return bs(mid+1, end, target, arr);
        }
        return bs(start, end-1, target, arr);
    }

}




