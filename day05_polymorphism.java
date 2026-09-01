public class day05_polymorphism {
    public static void main(String[] args) {
        airport a = new airport();
        PlaneBase c = new cargo();
        a.permit(c);
        System.out.println("---------------------");
        PlaneBase p = new passenger();
        a.permit(p);
        System.out.println("---------------------");
    }
}

class PlaneBase {
    void takeoff() {
        System.out.println("Plane is taking off");
    }
    void fly() {
        System.out.println("Plane is flying");
    }
    void land() {
        System.out.println("Plane is landing");
    }
}

class cargo extends PlaneBase {
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
    void carryCargo() {
        System.out.println("Cargo carries goods");
    }
}
class passenger extends PlaneBase {
    @Override
    void takeoff() {
        System.out.println("Plane is taking off, needs less time");
    }
    @Override
    void fly() {
        System.out.println("Passenger flies at high height");
    }
    @Override
    void land() {
        System.out.println("Passenger plane is landing safely");
    }
    void carryPassenger() {
        System.out.println("Passenger carries people");
    }
}
class airport {
    void permit(PlaneBase p) {
        p.takeoff();
        p.fly();
        p.land();
    }
}
