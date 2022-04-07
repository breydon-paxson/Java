package Week10.Homework;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    private int head;
    private int tail;
    private int count;
    private Queue<String> theQueue;

    public MyQueue() {
        head = 0;
        tail = 0;
        count = 0;
        theQueue = new LinkedList<>();
    }
    public void enqueue(String item) {
        if (count <= 5) {
            theQueue.add(item);
            count++;
            if (tail < 5-1) {
                tail++;
            } else {
                tail = 0;
            }
        } else {
            System.out.println("Its full");
        }
    }
    public String dequeue() {
        String out = " ";
        if (count > 0) {
            out = theQueue.peek();
            theQueue.remove();
            count--;
            if (head < 5 - 1) {
                head++;
            } else {
                head = 0;
            }
        }
        return out;
    }

    public String peek() {
        String out = "";
        if (count > 0) {
            out = theQueue.peek();
        }
        return out;
    }

    public void justArray(){
        System.out.println(theQueue);
    }

    public String toString()
    {
        String out = "";

        out = out + theQueue + " ";


        return out;
    }
    }
