package Week13.Homework;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class HmPrb4 {
    public static void main(String[] args) {
        int count = 0;
        try {
            File file = new File("test.txt");
            Scanner sc = new Scanner(file);
            ArrayList<String> lst = new ArrayList<>();
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String shortLine = line.replace(" ","");
                lst.add(line + " " + shortLine.length());

                count++;
            }
            sc.close();
            PrintWriter out = new PrintWriter("test.txt");
            for (String item : lst)
                out.println(item);
            out.close();

            System.out.println(count);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
