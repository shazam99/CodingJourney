package Top150.HashMaps;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdcd"));

    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int i=0; int j=0;
        Set<Character> set = new HashSet<>();
        while(i < s.length() && j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }else{
                set.remove(s.charAt(i));
                i++;
            }
            System.out.println(set);
        }

        return maxLen;
    }
}
