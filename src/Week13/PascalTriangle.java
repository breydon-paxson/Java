package Week13;

public class PascalTriangle {

    public static int[][] pascalTri(int n) {

        int[][] triangle = new int[n+1][];
        triangle[0] = new int[1];
        triangle[0][0] = 1;
        triangle[1] = new int[2];
        triangle[1][0] = 1;
        triangle[1][1] = 1;
        for (int row = 2; row < n+1; row++) {
            triangle[row] = new int[row+1];
            triangle[row][0] = 1;
            triangle[row][row] = 1;
            for (int col = 1; col < row; col++) {
                triangle[row][col] = triangle[row - 1][col] + triangle[row - 1][col - 1];
            }
        }

        return triangle;
    }

    public static void main(String[] args) {
        PrintUtils.printIntMatrix(pascalTri(5));
    }
}
