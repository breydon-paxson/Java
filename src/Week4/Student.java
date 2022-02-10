package Week4;

public class Student {
    //attributes
    private String StudentName;
    private int idNumber;
    private static int nextID = 100;

    //constructor
    public Student(String StudentName, int idNumber) {
        this.StudentName = StudentName;
        this.idNumber = idNumber;
    }
    public Student(String StudentName) {
        this.StudentName = StudentName;
        this.idNumber = nextID;
        nextID++;
    }
    //method
    public void NewName(String name2) {
        StudentName = name2;
    }

    public boolean precedesById(Student otherstudent) {
        if (idNumber < otherstudent.nextID) {
            return true;
        } else
            return false;
    }

    //print
    public String toString() {
        return StudentName + "'s id number is " + idNumber;
        }
    }


