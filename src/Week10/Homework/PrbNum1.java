package Week10.Homework;

import java.util.Stack;

public class PrbNum1 {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<String>();
        myStack.push("b");
        myStack.push("y");
        myStack.push("e");
        myStack.pop();
        myStack.push("t");
        String ch1 = myStack.peek();
        System.out.println(myStack);
        myStack.push("e");
        myStack.push("c");
        myStack.push("a");
        String ch2 = myStack.pop();
        System.out.println(myStack);
        myStack.push("o");
        myStack.push("d");
        myStack.push("e");
        myStack.push("s");
        String ch3 = myStack.pop();
        System.out.println(myStack);
    }
}
