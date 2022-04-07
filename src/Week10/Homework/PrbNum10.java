package Week10.Homework;

import java.util.*;

public class PrbNum10 {
    public static int positiveNumbers(LinkedList<Integer> numbers) {
        ListIterator<Integer> iter = numbers.listIterator();
        while (iter.hasNext()) {
            int x = (Integer)iter.next();
            if (x > 0);
            iter.remove();
        }
        return 0;
    }

    public static void main(String[] args) {
        LinkedList<Integer> integer = new LinkedList<>();
        integer.add(3);
        integer.add(-3);
        integer.add(-43);
        positiveNumbers(integer);
        System.out.println(integer);
    }
}
