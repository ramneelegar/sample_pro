import java.util.*;

public class Day05Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cargo c = new Cargo();
        c.takeOff();
        c.fly();
        c.land();
        c.carryCargo();

        System.out.println("---------------------");

        Passenger p = new Passenger();
        p.takeOff();
        p.fly();
        p.land();
        p.carryPassenger();

        sc.close();
    }
}

// Parent Class
class Plane {

    void takeOff() {
        System.out.println("Plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane is landing");
    }
}

// Child Class 1
class Cargo extends Plane {

    @Override// for referance purpose only, if we remove it then also it will work
    void fly() {
        System.out.println("Cargo plane flies at low height");
    }

    void carryCargo() {
        System.out.println("Cargo plane carries goods");
    }
}

// Child Class 2
class Passenger extends Plane {

    @Override
    void fly() {
        System.out.println("Passenger plane flies at high height");
    }

    void carryPassenger() {
        System.out.println("Passenger plane carries people");
    }
}
