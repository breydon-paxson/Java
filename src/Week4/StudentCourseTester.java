package Week4;

public class StudentCourseTester {
    public static void main(String[] args) {
        Student bob = new Student("Bob", 12345);
        System.out.println(bob);

        Course math = new Course("Math", "155", "4");
        System.out.println(math);

        Course science = new Course("Science", "165", "4");
        System.out.println(science);
        System.out.println(science.equals(math));

        bob.NewName("Mark");
        System.out.println(bob);

        Student bob2 = new Student("Bob2");
        bob.precedesById(bob2);
        bob2.precedesById(bob);
        System.out.println(bob2);



    }
}
