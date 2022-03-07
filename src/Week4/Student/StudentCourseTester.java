package Week4.Student;

public class StudentCourseTester {
    public static void main(String[] args) {
        Student bob = new Student("Bob", 12345, new Math());
        System.out.println(bob);
        bob.courseAdd(new Course("Math", "200", "4"));
        bob.courseAdd(new Course("Math2", "250", "4"));
        bob.courseAdd(new Course("Math3", "320", "4"));
        bob.courseAdd(new Course("Math4", "350", "4"));
        bob.courseAdd(new Course("Math5", "400", "4"));
        System.out.println(bob);

        System.out.println();

        Student Breydon = new Student("Breydon", 54321, new CMSC());
        System.out.println(Breydon);
        Breydon.courseAdd(new CG_Course("CMSC", "100", "4", "Indianola"));
        Breydon.courseAdd(new Course("CMSC2", "200", "4"));
        Breydon.courseAdd(new CG_Course("CMSC3", "300", "4", "Indianola"));
        Breydon.courseAdd(new Course("CMSC4", "380", "4"));
        Breydon.courseAdd(new Course("CMSC5", "400", "4"));
        System.out.println(Breydon);
    }
}