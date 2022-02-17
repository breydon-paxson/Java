package Week5;

import java.util.Arrays;
import java.util.Random;

public class HwPrb4 {
    public static int[] randomNumber(int n, int top, int bottom) {
        int[] newArray = new int[n];

        Random randomGenerator = new Random();
        for(int i = 0; i < n; i ++) {
            int num = randomGenerator.nextInt(top-bottom) + bottom;
            newArray[i] = num;
        } return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomNumber(5, 100, 0)));
    }
}
