package StreamApi.Questions;

import java.util.List;

public class FlatMapSkills {
    public static void main(String[] args) {
        List<List<String>> list = List.of(
                List.of("java","html","javascript","sqlite","selenium","python"),
                List.of("spring","react","angular","vue"),
                List.of("mysql","sql","foundationdb","cassandara")
        );
        System.out.println(list);

        List<String> flatList = list.stream().flatMap(skillList -> skillList.stream()).toList();
        System.out.println(flatList);

        List<String> listWithS = flatList.stream().filter(skill -> skill.startsWith("s")).toList();
        System.out.println(listWithS);

        List<String> upp = listWithS.stream().map(String::toUpperCase).toList();
        System.out.println(upp);
    }
}