package Practice;


import java.util.HashMap;


public class Solution {
    public static void main(String[] args) {
        HashMap<Student, String> set = new HashMap<>();

        Student s1 = new Student(1,"A"); // 1
        Student s2 = new Student(2,"B"); // 2
        Student s3 = new Student(3,"C"); // 3

        set.put(s1,"A");
        set.put(s2,"B");
        set.put(s3,"C");

        System.out.println(set); // [1 : A, 2 : B, 3 : C]
        s2.setId(1);
        System.out.println(set); // [1 : A, 1 : B, 3 : C]
        set.remove(s2);
        System.out.println(set); // [1 : B, 3 : C]
    }

    
}
class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode(){
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
//        return this.id == other.id && this.name.equals(other.name);
        return this.id == other.id;
    }

    @Override
    public String toString(){
        return this.id + " : " + this.name;
    }
}