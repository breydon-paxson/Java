package week1;
import java.util.Scanner;
public class Pizza {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of slices");
        int num = input.nextInt();
        int numberOfSlices = num;
        System.out.println("Enter the diameter");
        int dia = input.nextInt();
        int diameter = dia;
        double area = Math.PI * Math.pow((diameter / 2),2);
        double areaOfSlice = area / numberOfSlices;

        System.out.println("The area of a slice is " + areaOfSlice);
        input.close();
    }

}
