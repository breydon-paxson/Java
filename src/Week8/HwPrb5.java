package Week8;

public class HwPrb5 {
    public static void recursiveMethod(int n) {
        if (n <= 1)
            System.out.println();
        else {
            System.out.println(n + " ");
            recursiveMethod(n - 1);
        }
    }
    public static int calculate(int n) {
        if (n <= 1) return n;
        else if (n == 0) return 0;
        else return n * calculate(n-1);
    }

    public static void main(String[] args) {
        System.out.println(calculate(4));
    }
}
