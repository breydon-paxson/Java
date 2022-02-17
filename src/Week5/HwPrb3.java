package Week5;

public class HwPrb3 {
    public static int addEvenNumbers(int[] numbers) {
        int product = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                product += number;
            }
        }
        return product;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        System.out.println(addEvenNumbers(test));
    }
}
