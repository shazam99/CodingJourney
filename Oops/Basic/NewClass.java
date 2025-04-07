package Oops.Basic;

import java.util.Arrays;

public class NewClass {
    public static void main(String[] args) {
        Test test = new Test();
        test.print();

        Exam exam = new Exam();
        exam.print();

        int[] arr = new int[]{1,2,3,4,5};
        Arrays.stream(arr);
    }

}
class Test{
    int marks = 100;
    String name = "Sid";

    public Test(){
        System.out.println(marks + " " + name); // 100 Sid
    }

    public void print(){
        System.out.println(marks + " " + name); // 100 Sid
    }
}

class Exam{
    int marks;
    String name ;

    public void print(){
        System.out.println(marks + " " + name); // 0 null
    }

}