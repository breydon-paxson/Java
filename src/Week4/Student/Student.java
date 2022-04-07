package Week4.Student;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Student {
    //attributes
    private String StudentName;
    private int idNumber;
    private static int nextID = 100;
    private ArrayList<Course> course;
    private Major major;

    //constructor
    public Student(String StudentName, int idNumber, Major major) {
        this.StudentName = StudentName;
        this.idNumber = idNumber;
        this.course = new ArrayList<>();
        this.major = major;
    }

    public Student(String StudentName, Major major) {
        this.StudentName = StudentName;
        this.idNumber = nextID;
        nextID++;
        this.major = major;
    }

    //method
    public void NewName(String name2) {
        StudentName = name2;
    }

    public String courseAdd(Course obj) {
        if (course.contains((obj))) {
            System.out.println("This student already is in the class " + obj + " ");
        } else if (course.size() >= 4) {
            System.out.println("The student is taking at least 4 classes already");
        } else {
            course.add((obj));
            System.out.println("The course " + obj + " has been added to the students roster");
        }
        return " ";
    }

    public String removeCourse(String obj) {
        if (course.contains(obj)) {
            course.remove(obj);
            System.out.println("The class " + obj + " is removed");
        } else {
            System.out.println("This student does not have this class in their roster");
        }
        return " ";
    }

    public boolean precedesById(Student otherstudent) {
        if (idNumber < otherstudent.nextID) {
            return true;
        } else
            return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return (StudentName.equals(other.StudentName) &&
                    idNumber == other.idNumber);
        } else return false;
    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 7;
        int h = 7;
        h = h + StudentName.hashCode() * HASH_MULTIPLIER;
        h += Integer.valueOf(idNumber).hashCode() * HASH_MULTIPLIER;

        return h;
    }

    public double averageScores(Map<Student, Map<Course, Double>> gradebook, Student student) {
        Set<Student> keyset = gradebook.keySet();
        double total = 0;
        for (Student key : keyset) {
            if (key.equals(student)) {
                Map<Course, Double> grades = gradebook.get(key);
                Set<Course> keyset2 = grades.keySet();
                for (Course key2 : keyset2) {
                    total += grades.get(key2);
                    total = total / grades.size();
                    return total;
                }
            }
        } return -1;
    }

            //print
            public String toString () {
                String out = " ";

                if (course.size() >= 4) {
                    out += (StudentName + "'s ID number is " + idNumber +
                            " and this student is considered full time if taking these courses " + course +
                            "\n" + " and this students major is " + major + " which is " +
                            major.qualifyForMajor(course) + ". Due to the qualification rules");
                } else if ((course.size() <= 3) && (course.size() > 0)) {
                    out += (StudentName + "'s ID number is " + idNumber +
                            " and this student is not considered full time. They are taking these courses. " + course +
                            "\n" + " and this students major is" + major + " which is " +
                            major.qualifyForMajor(course) + ". Due to the qualification rules");
                } else if (course.size() == 0) {
                    out += (StudentName + "'s ID number is " + idNumber +
                            " and this student is not enrolled at this school." + "\n" + " and this students major is"
                            + major + " which is " + major.qualifyForMajor(course) +
                            ". Due to the qualification rules");
                }
                return out;
            }
        }

