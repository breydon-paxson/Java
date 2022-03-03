package Week4.Student;

import java.util.ArrayList;

public class CMSC implements Major{
    public boolean qualifyForMajor(ArrayList<Course> courses) {
        int total = 0;
        int total2 = 0;

        for (int i = 0; i <= courses.size() - 1; i++)
        {
            Course temp = courses.get(i);
            if (temp.getDepartment().equals("CMSC")) {
                total++;
                if (temp.getCourseNumber() >= 300) {
                    total2++;
                }
            }
        }
        if (total >= 3 && total2 >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "CMSC";
    }
}
