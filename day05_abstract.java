import java.util.Scanner;

public class day05_abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cargo c = new cargo();

        System.out.println("---------------------");
        c.takeoff();
        c.fly();
        c.land();
        System.out.println("---------------------");

        sc.close();
    }
}

abstract class plane {
    abstract void takeoff();
    abstract void fly();
    abstract void land();
}

class cargo extends plane {

    @Override
    void takeoff() {
        System.out.println("Plane is taking off, needs more time");
    }

    @Override
    void fly() {
        System.out.println("Cargo flies at low height");
    }

    @Override
    void land() {
        System.out.println("Cargo plane is landing safely");
    }
}