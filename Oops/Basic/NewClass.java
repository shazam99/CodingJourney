package Oops.Basic;

public class NewClass {
    public static void main(String[] args) {
        Test test = new Test();
        test.print();
    }

}
class Test{
    int marks = 100;
    String name = "Siddharth";

    public Test(){
        System.out.println(marks + " " + name);
    }

    public void print(){
        System.out.println(marks + " " + name);
    }
}
