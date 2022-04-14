package Week12.Homework;

import java.util.ArrayList;
import java.util.List;

public class HmPrb6 {
    public static List<Integer> listReturn(List<Integer> test, int n) {
        List list = new ArrayList();
        if (n > test.size()) {
            System.out.println(test);
        } else {
            for (int i = 0; i < n; i++) {
                list.add(test.get(i));
            }
            System.out.println(list);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(3);
        lst.add(8);
        lst.add(-1);
        lst.add(5);
        lst.add(1);
        lst.add(4);
        System.out.println(lst);
        listReturn(lst, 0);
        listReturn(lst, 1);
        listReturn(lst, 2);
        listReturn(lst, 3);
        listReturn(lst, 8);

    }
}
