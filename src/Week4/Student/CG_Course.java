package Week4.Student;

public class CG_Course extends Course {
    private String location;

    public CG_Course(String department, String number, String hours, String location) {
        super(department, number, hours);
        this.location = location;
    }

    public String toString() { return super.toString() + ". this CG course is located in " + location;}
}
