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
