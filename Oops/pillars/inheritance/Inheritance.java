package Oops.pillars.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 40, 5);
        System.out.println(mb);
        System.out.println(mb instanceof Object); // instance of is used to check inheritance
        Bicycle b = new Bicycle(4,3);
        b.speed = 10;
        System.out.println(b);
    }
}

class Bicycle {
    /**
     * "protected" is made for Inheritance only
     */
    protected int gear;
    protected int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    public String toString() {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    public String toString() {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}