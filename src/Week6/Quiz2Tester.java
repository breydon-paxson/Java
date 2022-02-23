package Week6;

public class Quiz2Tester {
    public static void main(String[] args) {
        Quiz2 vehicle = new Quiz2(4, "Truck", "Blue", "Rick");
        System.out.println(vehicle);
        vehicle.sellVehicle("Bob");
        System.out.println(vehicle);
    }
}
