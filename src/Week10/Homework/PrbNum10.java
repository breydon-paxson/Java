package Week10.Homework;

import java.util.*;

public class PrbNum10 {
    public static int positiveNumbers(LinkedList<Integer> numbers) {
        ListIterator<Integer> iter = numbers.listIterator();
        while (iter.hasNext()) {
            if (numbers > 0);
            iter.remove();
        }
        return 0;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, -3, 4, 5, -30);
        positiveNumbers(linkedList);
        System.out.println(linkedList);
    }
}
