package Week4;

public class Student {
    //attributes
    private String StudentName;
    private String idNumber;

    //constructor
    public Student(String StudentName, String idNumber) {
        this.StudentName = StudentName;
        this.idNumber = idNumber;
    }
    //method
    public void NewName(String name2) {
        StudentName = name2;
    }

    //print
    public String toString() {
        return StudentName + "'s id number is " + idNumber;
        }
    }


