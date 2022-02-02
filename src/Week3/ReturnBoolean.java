package Week3;

public class ReturnBoolean {

    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;}
    }

    public static String isOdd2(int number) {
        if (number % 2 != 0) {
            return "true";
        } else {
            return "false";}
    }
    public static void main(String[] args) {
        if (isOdd2(41).equals("odd")) {
            System.out.println("it is odd");
        }
    }
}
