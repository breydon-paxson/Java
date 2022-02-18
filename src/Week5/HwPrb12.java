package Week5;

public class HwPrb12 {
    void rotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++)
            rotatebyOne(arr, n);
    }

    void rotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n -1] = temp;
    }

    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
    }

    public static void main(String[] args) {
        HwPrb12 rotate = new HwPrb12();
        int arr[] = {1,3,5,7,9};
        rotate.rotate(arr, 7, 9);
        rotate.printArray(arr, 9);
        System.out.println(rotate);
    }
}
