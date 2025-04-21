package Top150.HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordMap {
    // 290. Word Pattern
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] expand = s.split(" ");
        if(pattern.length() != expand.length) return false;

        Map<Character, String> map = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(expand[i])){
                    return false;
                }
                map.put(pattern.charAt(i),expand[i]);
            }
            if(!Objects.equals(map.get(pattern.charAt(i)), expand[i])) return false;
        }
        return true;
    }
}
