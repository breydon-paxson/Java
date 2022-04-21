package Week13.Homework;

public class HmPrb3 {
    public static void reverseTri(int arr[]) {
        int diff;
        for (int i = 0; i < arr.length - 1; i++) {
            diff = Math.abs(arr[i] - arr[i + 1]);
            System.out.print(diff + " ");
        }
    }

        public static void main (String[]args){
            int arr1[] = {2, 9, 28, 65, 126};
            reverseTri(arr1);
        }
    }
