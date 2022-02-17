package Week6;

public class PersonTester {
    public static void main(String[] args) {
//        Person p1 = new Person("helen", "555-555-5555", "1234 first street");

        Person p1 = new Employee("helen", "555-555-5555", "1234 first street",
                                "Salesperson");
        Person p2 = new Customer("john", "777-777-7777", "777 7th Street", "eastern");

        printAddress(p2);
    }

    public static void printAddress(Person person) {
        System.out.println(person.formatAddress());
    }
}
