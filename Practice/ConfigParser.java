package Practice;

import java.util.regex.*;

public class ConfigParser {
    public static boolean isValidConfig(String config) {
        String regex = "(\\w+\\|\\w+\\|\\w+)(@\\w+\\|\\w+\\|\\w+)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(config);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String config = "E1|partial1|key1@E2|partial2|key2@E3|partial3|key3";
        System.out.println(isValidConfig(config));
    }
}
