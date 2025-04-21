package Top150.HashMaps;

import java.util.*;

public class GroupAnagrams {
    

    public static void main(String[] args){
        String[] str = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
        
    }
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);

            if (map.containsKey(sorted)) {
                map.get(sorted).add(s);
            } else {
                map.put(sorted, new ArrayList<>(List.of(s)));

            }
        }

        return new ArrayList<>(map.values());
    }

}
