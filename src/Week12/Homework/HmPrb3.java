package Week12.Homework;

public class HmPrb3 {
    <T>void test1(T[] array, T first, T last) {
        for (int i = 0; i < array.length; i++) {
            int breydon = (Integer)first;
            int ross = (Integer)last;
            int x = (Integer)array[i];
            if ((x >= breydon) && (x <= ross)) {
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args) {
        HmPrb3 obj = new HmPrb3();
        Integer intArray[] = {34, 22, 56, 74, 80};
        obj.test1(intArray, 34, 74);
    }
}
