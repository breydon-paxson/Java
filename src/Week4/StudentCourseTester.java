package Week4;

public class StudentCourseTester {
    public static void main(String[] args) {
        Student bob = new Student("Bob", "12345");
        System.out.println(bob);

        Course math = new Course("Math", "155", "4");
        System.out.println(math);

        bob.NewName("Mark");
        System.out.println(bob);
    }
}
