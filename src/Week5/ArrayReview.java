package Week5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayReview {
    public static void main(String[] args) {
        double[] myArray = {10.2, 87.6, 95.5, 0};
        System.out.println(Arrays.toString(myArray));
        System.arraycopy(myArray, 1, myArray, 2, myArray.length - 2);
        myArray[1] = 1111;
        System.out.println(Arrays.toString(myArray));
        double[] temp = new double[2 * myArray.length];
        System.arraycopy(myArray, 0, temp, 0, myArray.length);
        myArray = temp;

        //System.out.println(myArray[2]);
        //System.out.println(Arrays.toString(myArray));
        //System.out.println(myArray[myArray.length - 1]);
        //double[] myArray2 = myArray;
        //myArray2[0] = 100.10;
        //System.out.println(Arrays.toString(myArray));

        //ArrayList<String> lst = new ArrayList<>();
        //lst.add("hi");
        //lst.add("bye");
        //lst.add("sigh");

        //System.out.println(lst.contains("byeall"));

        //System.out.println(lst.get(2));
        //for (String element : lst) {
            //if (element.equals("bye")) {
                //System.out.println(true);
            //}
        //}
    }
}
