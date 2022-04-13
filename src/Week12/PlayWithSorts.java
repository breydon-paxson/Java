package Week12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayWithSorts {
    public static void main(String[] args) {
        String[] temp = {"one", "hello", "a"};
        List<String> lst = new ArrayList<>(Arrays.asList(temp));
        System.out.println(lst);

        //Below is sorted by alphabetical order
        Collections.sort(lst);
        System.out.println(lst);

        //Below is sorted by length
        Collections.sort(lst, (String first, String second) -> Integer.compare(first.length(), second.length()));
        System.out.println(lst);


    }
}
