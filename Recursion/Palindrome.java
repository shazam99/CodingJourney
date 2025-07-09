package Recursion;

public class Palindrome {
    public static void main(String[] args){

        String str = "abcdedcba ";
        System.out.println(isPalindrome(str, ""));

    }
    public static boolean isPalindrome(String org, String mod){

        if(org.length() == mod.length()){
            return org.equals(mod);
        }

        mod+= org.charAt(org.length()-1 - mod.length());

        return isPalindrome(org, mod);
    }
}
