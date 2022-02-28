package Week7.week7Examples;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonAlg {
    public static boolean lessThanNumber(ArrayList<Integer> lst, int topValue) {
        for (Integer item : lst) {
            if (topValue > item) {
                return true;
            }
        }
        return false;
    }

    public static boolean allLessThanNumber(ArrayList<Integer> lst, int topValue) {
        for (Integer item : lst) {
            if (item >= topValue) {
                return false;
            }
        }
        return true;
    }

    public static int findMinimum(ArrayList<Integer> lst) {
        int currentMinimum = lst.get(0);
        for (int index = 1; index < lst.size(); index++) {
            if (currentMinimum > lst.get(index)) {
                currentMinimum = lst.get(index);
            }
        }
        return currentMinimum;
    }

    public static void main(String[] args) {

        Integer[] x = {20, 2, -10, -3};
        ArrayList<Integer> tstLst = new ArrayList<>(Arrays.asList(x));
//        System.out.println(lessThanNumber(tstLst, 10));
//
//        System.out.println(allLessThanNumber(tstLst, 10));
        System.out.println(findMinimum(tstLst));
    }



}
