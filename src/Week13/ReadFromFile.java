package Week13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        // Try reading from a file
        try {
            File reader = new File("test1.txt");
            Scanner in = new Scanner(reader);
            String word = "";

            while (in.hasNext()) {
                word = in.nextLine();
                System.out.println(word);
            }
            in.close();
        } catch (IOException exception) {
            System.out.println("Oops - can't find file " + exception);
        }
    }
}