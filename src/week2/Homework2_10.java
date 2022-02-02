package week2;
import java.util.Scanner;

public class Homework2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letter grade: ");
        String letterGrade = input.next();
        int gradeValue = 0;
        switch(letterGrade)
        {
            case "A":
                System.out.println("A is worth 4");
                gradeValue = 4;
                break;
            case "B":
                System.out.println("B is worth 3");
                gradeValue = 3;
                break;
            case "C":
                System.out.println("C is worth 2");
                gradeValue = 2;
                break;
            case "D":
                System.out.println("D is worth 1");
                gradeValue = 1;
                break;
            case "F":
                System.out.println("F is worth 0");
                gradeValue = 0;
                break;
            default:
                System.out.println("Oops");
        }

    }
}
