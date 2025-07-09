package StreamApi.Questions;

import java.util.Comparator;
import java.util.List;

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "John", 60000),
                new Employee(2, "Jane", 75000),
                new Employee(3, "Alice", 60000),
                new Employee(4, "Bob", 50000)
        );

        List<Employee> sortedList = employees.stream()
                .sorted(Comparator
                        .comparingDouble(Employee::getSalary).reversed()
                        .thenComparing(Employee::getName)
                )
                .toList();
        sortedList.forEach(System.out::println);
    }

}

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}
