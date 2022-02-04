package Week4;

public class QuizProblem3 {
    public static int Bob(int a, int b) {
        int count = 0;
        while(b != (a-1)) {
            count += b;
            b--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Bob(2, 4));
    }
}
