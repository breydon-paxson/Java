package Week5;

import java.util.Arrays;

public class TryArrays {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        int myArray2[] = new int[2];
        int[] myArray3 = {100,200,300,400};
        //BankAccount[] accts = {new BankAccount("suzy"), new BankAccount("Timmy")};
        //System.out.println(accts[1]);
        //myArray[1] = 10;
        //System.out.println(Arrays.toString(myArray));

        //System.out.println(myArray[1]);

        //int x = myArray[1] + 100;
        //System.out.println(x);
        System.out.println(Arrays.toString(myArray3));
        System.out.println("The length is " + myArray3.length);
        System.out.println("item in last index is " + myArray3[myArray3.length-1]);
    }
}
