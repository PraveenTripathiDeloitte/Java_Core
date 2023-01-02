package inheritance;

public class TestInheritance {

    public static void main(String[] args) {
        Child c = new Child();
        c.f1();
        c.f2();
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.fuel());
        vehicle = new Bike();
        System.out.println(vehicle.fuel());
        vehicle = new Bus();
        System.out.println(vehicle.fuel());
        vehicle = new Car();
        System.out.println(vehicle.fuel());
    }
}
