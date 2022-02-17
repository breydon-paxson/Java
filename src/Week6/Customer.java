package Week6;

public class Customer extends Person{
    private String salesRegion;

    public Customer(String name, String phone, String address, String region) {
        super(name, phone, address);
        salesRegion = region;
    }

    public void findLocationInfo() {
        System.out.println("customer");
        System.out.println(getAddress());
    }

    public String formatAddress() {
        return "Welcome customer: " + getAddress();
    }
}
