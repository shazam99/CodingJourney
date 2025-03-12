package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8Demo {
    public static void main(String[] args) {

        // 1. Lambda Function
        Thread t = new Thread(() -> System.out.println("hello")); // traditionally we pass "MyThread" here
        t.start();
        // Function interface can hold Lambda Function
        // This is known as Functional Programming
        MathOperation sumOperation = (a,b) -> (a+b);
        System.out.println(sumOperation.operate(10,20));

        // 2. Predicate
        // Predicate -> Functional Interface (holds boolean value)
        Predicate<Integer> even = x -> x%2==0;
        System.out.println(even.test(5));

        // 3. Function
        // Function -> Works for you
        Function<Integer, Integer> doubleIt = x -> 2*x;
        System.out.println(doubleIt.apply(5));
        System.out.println(doubleIt.andThen(doubleIt).apply(5));

        // 4. Consumer -> Only Accepts
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(5);
        List<Integer> list = Arrays.asList(10,20,30,40);
        Consumer<List<Integer>> printList = x -> {
            for (int i: x) System.out.println(x);
        };
        printList.accept(list);

        // 5. Supplier -> only gives
        Supplier<String> dbConnectionSuccess = () -> "Connection Success";
        System.out.println(dbConnectionSuccess.get());

        // 6. Combined Example
        Predicate<Integer> predicate = x -> x%2 == 0;
        Function<Integer, Integer> function = x -> x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        // 7. Similarly, we have BiFunction, BiPredicate, BiConsumer

        // 8. Method Reference -> use method without invoking & in place Lambda Reference
        List<String> students = Arrays.asList("Ram", "Avtar", "Sharma");
        students.forEach(System.out::println);
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("hello");
    }
}

@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}