package Week13.Homework;

import java.io.*;
import java.util.Scanner;

public class HmPrb4 {
    public static void main(String[] args) {
        int count = 0;
        try {
            File file = new File("test.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            System.out.println(count);
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

