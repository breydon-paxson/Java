package week2;
import java.util.Scanner;

public class AskUser {
    public static void main(String[] args) {
        boolean done = false;
        double total = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);
        while (!done)
        {
            System.out.println("Please enter a number or q to quit: ");
            String txt = input.next();
            if (txt.equals("q"))
            {
                done = true;
            } else
            {
                total += Double.parseDouble(txt);
                count++;
            }
        }
        if (count > 0)
        {
            System.out.println("Average is " + total / count);
        } else
        {
            System.out.println("Average is 0");
        }

    }
}
