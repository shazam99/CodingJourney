package String;

import java.util.Arrays;

public class KMP {

    public static void main(String[] args){
        int[] arr = compute("ABABCABAB");
        System.out.println("LPS: " + Arrays.toString(arr));

    }
    public static int[] compute(String str){

        int n = str.length();
        int[] lps = new int[n];

        // Length of previous longest prefix
        int len = 0;
        
        // lps[0] is always 0
        lps[0] = 0;

        // loop calculates lps[i] from i to n-1
        int i=1;
        while(i < n){
            if(str.charAt(i) == str.charAt(len)){
                len++;        // increment length
                lps[i] = len; // add curr to len
                i++;          // increment i
            }

            // Mismatch
            else{
                // if len!=0 , update len -> len-1
                if(len != 0){
                    len = lps[len-1];
                }
                // if len==0, set lps[i] -> 0 and i++
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    
}
