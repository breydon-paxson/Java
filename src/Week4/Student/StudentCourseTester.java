package Week4.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentCourseTester {
    public static void main(String[] args) {
        String mathString = "Math";
        String computerScienceString = "CMSC";
        Math math = new Math();
        CMSC cmsc = new CMSC();

        Course fundamentalsI = new Course(computerScienceString, "150", "4");
        Course algorithms = new Course(computerScienceString, "250", "3");
        Course math200 = new Course(mathString, "200", "4");
        Course religion101 = new Course("Religion", "101", "4");

        Student roseBush = new Student("Rose Bush", 123, math);
        Student helenHeaven = new Student("Helen Heaven", 987, cmsc);
        Student jerryAttrick = new Student("Jerry Attrick", 444, cmsc);
        Student tommyGunn = new Student("Tommy Gunn", 515, cmsc);

        Map<Course, Double> jerryScores = new HashMap<>();
        jerryScores.put(fundamentalsI, 92.3);
        jerryScores.put(algorithms, 87.6);
        jerryScores.put(math200, 88.8);
        //System.out.println(jerryScores.get(fundamentalsI) < jerryScores.get(algorithms));

        Map<Student, Map<Course, Double>> gradebook = new HashMap<>();
        jerryAttrick.averageScores(gradebook, jerryAttrick);
        System.out.println(jerryAttrick.averageScores(gradebook, jerryAttrick));

//        Map<Course, Double> roshScores = new HashMap<>();
//        roshScores.put(religion101, 77.7);
//        Map<Student, Map<Course, Double>> gradebook = new HashMap<>();
//        gradebook.put(roseBush, roshScores);
//        gradebook.put(jerryAttrick, jerryScores);
//        jerryScores.put(fundamentalsI, 66.6);
//        gradebook.put(helenHeaven, jerryScores);
//        System.out.println(gradebook.get(helenHeaven).get(fundamentalsI));
//        System.out.println(gradebook.get(jerryAttrick).get(fundamentalsI));
//        System.out.println(gradebook.get(tommyGunn).get(fundamentalsI));
    }
}