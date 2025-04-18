package Utility;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Utils {
    public static void printFields(Object obj) {
        if (obj == null) {
            System.out.println("null");
            return;
        }

        Class<?> clazz = obj.getClass();
        System.out.println(clazz.getSimpleName() + " {");

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            try {
                Object value = field.get(obj);
                System.out.println("  " + field.getName() + " = " + value);
            } catch (IllegalAccessException e) {
                System.out.println("  " + field.getName() + " = [access denied]");
            }
        }

        System.out.println("}");
    }


}