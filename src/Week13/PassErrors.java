package Week13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PassErrors {
    public static void readFile(String filename) throws IOException{
        // Try reading from a file
            File reader = new File(filename);
            Scanner in = new Scanner(reader);
            String word = "";

            while (in.hasNext()) {
                word = in.nextLine();
                System.out.println(word);
            }
            in.close();
        }

    public static void main(String[] args) {
    try {
        readFile("test.txt");

        } catch (IOException exception) {
            System.out.println("Oops - can't find file " + exception);
        }
    }
}
