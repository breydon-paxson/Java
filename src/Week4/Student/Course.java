package Week4.Student;

public class Course implements Comparable<Course> {
    //attributes
    private String department;
    private int number;
    private int hours;

    //constructor
    public Course(String department, String number, String hours) {
        this.department = department;
        number = number;
        hours = hours;
    }


    public boolean equals(Object obj) {
        boolean result;
        if (obj instanceof Course) {
            Course courseOne = (Course) obj;
            if ((courseOne.department.equals(department)) &&
                (courseOne.number == number) && (courseOne.hours == hours)) {
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
        return number;
    }

    @Override
    public int compareTo(Course course) {
        if (this.department.compareTo(course.department) == 0) {
            if (this.number < course.number) {
                return -2;
            } else if (this.number > course.number) {
                return 2;
            } else {
                return 0;
            }
        } else {
            return this.department.compareTo(department);
        }
    }

    //print
    public String toString() {
        return department + " with credit level " + number + " and " + hours + " credit hours";
    }

}

