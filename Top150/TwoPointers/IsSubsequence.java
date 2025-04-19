package Top150.TwoPointers;

public class IsSubsequence {
    // 392. Is Subsequence
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        char[] sml = s.toCharArray();
        char[] big = t.toCharArray();
        int i=0;
        int j=0;
        // check for each element in small, that it occurs in big and in order
        while(i<sml.length && j<big.length){
            if(sml[i] == big[j]){
                i++;
            }
            j++;
        }
        return i==sml.length;
    }
}
