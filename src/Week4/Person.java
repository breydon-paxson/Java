package Week4;

public class Person {
    //attributes
    private String name;
    private String ssn;
    private String phone;

    //constructor
    public Person(String name, String ssn, String phone) {
        this.name = name;
        this.ssn = ssn;
        this.phone = phone;
    }

    //print
    public String toString() {
        return name + " has " + ssn + " and " + phone;
    }
}
