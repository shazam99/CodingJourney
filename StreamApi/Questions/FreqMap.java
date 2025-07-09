package StreamApi.Questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FreqMap {
    public static void main(String[] args) {
        String str = "siddharth";
        Map<Character,Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c->c,
                Collectors.counting()
        ));

        System.out.println(map);


        List<Integer> list = str.chars().boxed().toList();
        System.out.println(list);
    }
}
