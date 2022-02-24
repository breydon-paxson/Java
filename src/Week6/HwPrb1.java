package Week6;

import java.util.Arrays;

public class HwPrb1 {
    public static boolean floatingNumber(float low, float high, int[] array) {
        boolean result = false;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > low) {
                if (array[i] < high) {
                    result = true;
                } else
                {
                    return false;
                }
            }
            else {
                return false;
            }
            }
            return result;
        }

    public static void main(String[] args) {
        int[] myArray = {2,57,4,64,75,3};
        System.out.println(floatingNumber(1,48, myArray));
    }
    }

