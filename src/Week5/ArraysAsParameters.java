package Week5;

public class ArraysAsParameters {
    public static int multiplyArrayElements(int[] numbers) {
        int product = 1;
        for (int number : numbers)
            product *= number;
        return product;
    }

    public static void main(String[] args) {
        int[] test = {2, 3, 4, 5};
        System.out.println(multiplyArrayElements(test));
    }
}
