package Week4;

public class StudentCourseTester {
    public static void main(String[] args) {
        Student bob = new Student("Bob", 12345);
        System.out.println(bob);
        bob.courseAdd("Math");
        bob.courseAdd("Science");
        bob.courseAdd("Biology");
        bob.courseAdd("Computer Science");
        bob.courseAdd("Math");
        bob.courseAdd("History");
        bob.removeCourse("Math");
        bob.courseAdd("Math");
        System.out.println(bob);

        WorkStudyStudent mark = new WorkStudyStudent("Mark", 54321, 35);
        System.out.println(mark);
        mark.AddHours(15);
        System.out.println(mark);
//        mark.courseAdd("Math");
//        mark.courseAdd("History");
//        mark.courseAdd("Science");
//        mark.courseAdd("Math");
//        System.out.println(mark);

        Course math = new Course("Math", "155", "4");
        System.out.println(math);

        Course science = new Course("Science", "165", "4");
        System.out.println(science);
        System.out.println(science.equals(math));

        CG_Course History = new CG_Course("History", "275", "5", "Indianola");
        System.out.println(History);

        mark.courseAdd("History");
        System.out.println(mark);


    }
}
