package Week4;

public class ExtraMathFunctions {
    public static double percentOf(int percentage, double number) {
        double output = (percentage / 100.0) * number;
        return output;
    }

    public static double findPercent(double x, double y) {
        double output = (x / y) * 100;
        return output;
    }

    public static void main(String[] args) {
        System.out.println(ExtraMathFunctions.percentOf(20, 115));
        System.out.println(ExtraMathFunctions.findPercent(100, 200));
    }
}
