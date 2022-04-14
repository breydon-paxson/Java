package Week12.Homework;

import java.util.Arrays;

public class OurStack <T>{

    private T[] elements;
    private int size;

    public OurStack(T[] emptyStack) {
        elements = emptyStack;
        size = 0;
    }

    public void push(T item) {
        if (size >= elements.length) {
            increaseCapacity();
        }
        elements[size] = item;
        size++;
    }

    public T pop() {
        T top = (T) "";
        if (size > 0) {
            top = elements[size-1];
        }
        size--;
        return top;
    }

    public T peek() {
        T top = (T) "";
        if (size > 0) {
            top = elements[size-1];
        }
        return top;
    }

    private void increaseCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public String toString() {
        String out = "";
        for (int count = 0; count < size; count++) {
            out = out +  elements[count] + " ";
        }
        return out;
    }

}
