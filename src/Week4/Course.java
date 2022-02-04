package Week4;

public class Course {
    //attributes
    private String department;
    private String number;
    private String hours;

    //constructor
    public Course(String department, String number, String hours) {
        this.department = department;
        this.number = number;
        this.hours = hours;
    }
    //print
    public String toString() {
        return "The course is " + department + " with credit level " + number + " and " + hours + " credit hours";
    }
}

