package Week10.Homework;

import java.util.LinkedList;
import java.util.Queue;

public class PrbNum2 {
    public static void main(String[] args) {
        Queue<Double> theQ = new LinkedList<>();
        theQ.add(5.3);
        theQ.add(3.4);
        theQ.add(4.6);
        double d1 = theQ.remove();
        System.out.println(theQ);
        theQ.add(18.3);
        double d2 = theQ.peek();
        System.out.println(theQ);
        theQ.add(4.5);
        theQ.add(81.6);
        theQ.remove();
        System.out.println(theQ);
    }
}
