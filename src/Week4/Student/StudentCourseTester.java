package Week4.Student;

public class StudentCourseTester {
    public static void main(String[] args) {
        Course math = new Course("Math", "155", "4");

        System.out.println();

        Course science = new Course("Science", "165", "4");

        System.out.println();

        CG_Course History = new CG_Course("History", "275", "5", "Indianola");

        System.out.println();

        Student bob = new Student("Bob", 12345, new Math());
        System.out.println(bob);
        bob.courseAdd(new Course("Math", 121));
        bob.courseAdd("Science");
        bob.courseAdd("Math2");
        bob.courseAdd("Math3");
        bob.courseAdd("Math4");
        bob.courseAdd("Math5");
        System.out.println(bob);

        System.out.println();

        Student Breydon = new Student("Breydon", 54321, new CMSC());
        System.out.println(Breydon);
        Breydon.courseAdd("CMSC");
        Breydon.courseAdd("History");
        Breydon.courseAdd("CMSC2");
        Breydon.courseAdd("CMSC3");
        Breydon.courseAdd("CMSC4");
        Breydon.courseAdd("CMSC5");
        System.out.println(Breydon);
    }
}
