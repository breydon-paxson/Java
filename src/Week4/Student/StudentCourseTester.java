package Week4.Student;

public class StudentCourseTester {
    public static void main(String[] args) {
        Course math = new Course("Math", "155", "4");
        System.out.println(math);

        System.out.println();

        Course science = new Course("Science", "165", "4");
        System.out.println(science);

        System.out.println();

        CG_Course History = new CG_Course("History", "275", "5", "Indianola");
        System.out.println(History);

        System.out.println();

        Student bob = new Student("Bob", 12345, new Math());
        System.out.println(bob);

        System.out.println();

        WorkStudyStudent mark = new WorkStudyStudent("Mark", 54321, new CMSC(),35);
        System.out.println(mark);
        mark.AddHours(15);
        System.out.println(mark);

        mark.courseAdd("History");
        System.out.println(mark);


    }
}
