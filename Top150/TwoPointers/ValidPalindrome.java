package Top150.TwoPointers;

public class ValidPalindrome {
    // 125. Valid Palindrome
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
//        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;
        while(start<=end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }else{
                if(s.charAt(start) != s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
