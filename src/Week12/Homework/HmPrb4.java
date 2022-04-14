package Week12.Homework;

import java.util.ArrayList;
import java.util.List;

public class HmPrb4 {
    public static List<String> insertString(List<String> lst, String element ) {
        List<String> words2 = new ArrayList<String>();
        for (int i = 0; i < lst.size(); i++) {
            words2.add(element);
            words2.add(lst.get(i));
        }
        lst = words2;
        return lst;
    }
    public static void main(String[] args) {
        // Add a small string in front of every word in the ArrayList
        List<String> words = new ArrayList<String>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
        System.out.println("Before " + words);
        words = insertString(words, "~");
        System.out.println("After " + words);
    }
}
