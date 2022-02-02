package Week3;

public class HW2Pob4 {

    public static void main(String[] args) {
        double currentDayMiles = 10;
        double totalMiles = 0;
        int dayCount = 0;


        do {
            totalMiles += currentDayMiles;
            dayCount++;
            System.out.print("Day " + dayCount + " miles traveled " + currentDayMiles);
            System.out.println(" and total miles " + totalMiles);
            currentDayMiles *= 0.7;
        } while (currentDayMiles >= 0.1);
        totalMiles += currentDayMiles;
        dayCount++;
        System.out.print("Day " + dayCount + " miles traveled " + currentDayMiles);
        System.out.println(" and total miles " + totalMiles);
    }
}
