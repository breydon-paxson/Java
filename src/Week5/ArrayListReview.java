package Week5;

import java.util.ArrayList;

public class ArrayListReview {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);
        System.out.println(myList);
        myList.add(1);
        System.out.println(myList);
        myList.add(1, 3);
        System.out.println(myList);
        myList.set(0, 4);
        System.out.println(myList);
        myList.add(myList.get(1));
        System.out.println(myList);
        //myList.remove(myList.size() - 1);
        //System.out.println(myList);
        myList.remove(new Integer(3));
        System.out.println(myList);
        myList.remove(myList.size());
        System.out.println(myList);
    }


}
