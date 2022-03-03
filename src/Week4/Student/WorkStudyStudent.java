package Week4.Student;

import Week4.Student.Student;

public class WorkStudyStudent extends Student {
    private int hoursWorked;

    public WorkStudyStudent(String StudentName, int idNumber, Major major, int hoursWorked) {
        super(StudentName,idNumber, major);
        this.hoursWorked = hoursWorked;
    }

    public void AddHours(double newHours) {
        hoursWorked += newHours;
    }

    public String toString() { return super.toString() + " hours worked " + hoursWorked + " and earned " +
            (hoursWorked * 7.25) + " dollars. Also, they are a work study student.";}
}
