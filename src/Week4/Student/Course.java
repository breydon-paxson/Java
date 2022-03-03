package Week4.Student;

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


    public boolean equals(Object obj) {
        boolean result;
        if (obj instanceof Course) {
            Course courseOne = (Course) obj;

            if (courseOne.department.equals(department)) {
                result = true;
            } else {
                result = false;
            }
            return result;
        } else {
            result = false;
        }
        return result;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getCourseNumber() {
        int getNum = Integer.parseInt(number);

        return getNum;
    }

    //print
    public String toString() {
        return "The course is " + department + " with credit level " + number + " and " + hours + " credit hours";
    }

}

