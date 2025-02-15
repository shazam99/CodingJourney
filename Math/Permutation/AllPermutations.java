package Math.Permutation;

import java.util.*;

public class AllPermutations {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,10};
//        List<List<Integer>> result = new ArrayList<>();
        Map<List<Integer>, Integer> map = new HashMap<>();
        generate(arr, new ArrayList<>(), map, new boolean[arr.length]);

        System.out.println(map.size()*8);

    }
    public static void generate(int[] arr, List<Integer> currentPermutation,  Map<List<Integer>, Integer> map, boolean[] used){
        if(4 == currentPermutation.size()){
            List<Integer> temp = new ArrayList<>(currentPermutation);
            if(temp.get(0)*temp.get(1) == temp.get(2)*temp.get(3)){
                Collections.sort(temp);
                if(!map.containsKey(temp)){
                    map.put(temp,8);
                }
            }
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(used[i]) continue;

            used[i] = true;
            currentPermutation.add(arr[i]);

            generate(arr, currentPermutation, map, used);

            used[i] = false;
            currentPermutation.removeLast();
        }
    }

}

