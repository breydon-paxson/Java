package Week5;

import java.util.ArrayList;

public class HwPrb2 {
    public static void main(String[] args) {
        ArrayList<Double> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        list1.add(2.0);
        list1.add(3.0);
        list1.add(4.0);
        list1.add(5.0);

        for (Double item : list1) {
            list2.add(item);
        }
        list2.add(6.0);
        list2.add(7.0);
        list2.add(8.0);
         System.out.println(list2);
    }
}
