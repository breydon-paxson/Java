package Week12.Homework;

import java.util.ArrayList;
import java.util.List;

public class HmPrb4 {
    public static void insertString(List<String> lst, String element ) {
        for (int i = 0; i < lst.size(); i++ )  {
            lst.add(i, element);
        }
    }
    public static void main(String[] args) {
        // Add a small string in front of every word in the ArrayList
        ArrayList<String> words = new ArrayList<String>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
        System.out.println("Before " + words);
        insertString(words, "~");
        System.out.println("After " + words);
    }
}
