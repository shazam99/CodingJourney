package StreamApi;

import java.util.List;
import java.util.stream.Stream;

/**
 * What is a Stream?
 * <p>
 * A stream is a sequence of elements supporting sequential and parallel aggregate operations.
 * A stream is an object that references a sequence of other objects.
 * </p>
 */
public class OneShot {

    record Car(String type, String make, String model, int year) {
    }

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("sedan",     "BMW",      "530",     1998),
                new Car("sedan",     "Audi",     "A5",      1998),
                new Car("sedan",     "Mercedes", "E-Class", 2005),
                new Car("hatchback", "Skoda",    "Octavia", 1600),
                new Car("hatchback", "Toyota",   "TypeR",   1450)
        );

        // 1. Filtering operation (type == sedan)
        List<Car> sedanCars = cars.stream().filter(c -> c.type.equals("sedan")).toList();
        System.out.println(sedanCars); // All Sedan cars, no hatchback

        // 2. Map function (Convert type of Elements)
        List<String> carMakeList = cars.stream()// converts the cars List<Car> -> Stream<Car>
                .map(Car::make)                 // from Stream<Car> -> Stream<String>
                .distinct()                     // filters only distinct, just like SET
                .sorted()                       // sorts the Stream
                .map(String::toLowerCase)       // converts the Stream<String> to lowerCase
                .toList();                      // converts the Stream<String> to List<String>
        System.out.println(carMakeList);        // -> [audi, bmw, mercedes, skoda, toyota]

        // 3. FlatMap function (Flattens out the result)
        List<String> carMakeModelList = cars.stream().flatMap(car -> Stream.of(car.make, car.model)).toList();
        System.out.println(carMakeModelList); // -> [BMW, 530, Audi, A5, Mercedes, E-Class, Skoda, Octavia, Toyota, TypeR]
    }
}
