package Oops.pillars.inheritance;

public class SuperThisKeywords {
    public static void main(String[] args) {
       Audi audi = new Audi();
    }
}

class Vehicle {
    int maxSpeed = 120;
    int minSpeed = 10;
    Vehicle() {
        System.out.println("Vehicle Constructor");

    }
}

class Car extends Vehicle {
    int maxSpeed = 100;
    int minSpeed = 20;
    Car() {
        System.out.println("car Constructor");
    }

}

class Audi extends Car {
    Audi() {
        System.out.println("Audi Constructor");
    }
    int maxSpeed = 150;
    int minSpeed = 30;

}
