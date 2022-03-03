package Week4.Student;

import java.util.ArrayList;

public class Student {
    //attributes
    private String StudentName;
    private int idNumber;
    private static int nextID = 100;
    private ArrayList<String> course;
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

    public String courseAdd(String obj) {
        if (course.contains(String.valueOf(obj))) {
            System.out.println("This student already is in the class " + obj + " ");
        } else if (course.size()==4) {
            System.out.println("The student has 4 classes already");
        } else {
            course.add(String.valueOf(obj));
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

    //print
    public String toString() {
        String out = " ";

        if (course.size() ==4) {
            out += (StudentName + "'s ID number is " + idNumber +
                    " and this student is considered full time if taking these courses " + course);
        } else if ((course.size() <= 3) && (course.size() > 0)) {
            out += (StudentName + "'s ID number is " + idNumber +
                    " and this student is not considered full time. They are taking these courses. " + course);
        } else if (course.size() == 0) {
            out += (StudentName + "'s ID number is " + idNumber +
                    " and this student is not enrolled at this school. ");
        }
        return out;
        }
    }


