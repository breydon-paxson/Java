package Week13.Homework;

import java.util.Arrays;

public class HmPrb1 {
    public static void main(String[] args) {
        int[][] theArray = new int[3][4];
        for (int count = 0; count <= 3; count++) {
            theArray[0][count] = count;
        }
        for (int row = 1; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                theArray[row][col] = theArray[row-1][col+1] + 1;
            }
        }
        System.out.println();
        System.out.println(theArray.length);
        System.out.println(theArray[2].length);
        System.out.println();
        System.out.println(Arrays.deepToString(theArray));
    }
}
