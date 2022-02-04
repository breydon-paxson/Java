package Week4;
import java.util.Scanner;

public class QuizProblem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the child's age: ");
        String childAge = input.next();
        int age = Integer.parseInt(childAge);
        if (age < 5) {
            System.out.println("The child is in Preschool.");
        } else if
            ((age >= 5) && (age < 11)) {
            System.out.println("The child is in Elementary School");
        } else if
        ((age >= 11) && (age < 14)) {
            System.out.println("The child is in Middle School");
        } else if
        ((age >= 14) && (age < 18)) {
            System.out.println("The child is in High School");
        } else
            System.out.println("Not a child.");
    }
}
