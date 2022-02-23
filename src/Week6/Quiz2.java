package Week6;

public class Quiz2 {

    //attributes
    private int numberOfWheels = 0;
    private String type;
    private String color;
    private String owner;

    //constructor
    public Quiz2(int numberOfWheels, String type, String color, String owner) {
        this.numberOfWheels = numberOfWheels;
        this.type = type;
        this.color = color;
        this.owner = owner;
    }

    //Method to change owners
    public void sellVehicle(String owner) {
        this.owner = owner;
    }

    //toString
    public String toString() {
        return ("The vehicle is an " + type + " and has " + numberOfWheels + " wheels. The color of the vehicle is "
        + color + " and is owned by " + owner);
    }

}
