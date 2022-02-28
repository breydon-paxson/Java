package Week7;

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

    public static boolean alllessThanNumber(ArrayList<Integer> lst, int topValue) {
        for (Integer item : lst) {
            if (topValue >= item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] x = {20, 2, 10, -3};
        ArrayList<Integer> tstLst = new ArrayList<>(Arrays.asList(x));
        System.out.println(lessThanNumber(tstLst, 10));
    }
}
