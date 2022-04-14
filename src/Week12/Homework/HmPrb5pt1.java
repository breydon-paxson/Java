package Week12.Homework;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class HmPrb5pt1 {
//    public static ArrayList<String> removeDuplicates(ArrayList<String> test) {
//        ArrayList<String> lst = new ArrayList<>();
//        for (String item : test) {
//            if (!lst.contains(item)) {
//                lst.add(item);
//            }
//        }
//        return lst;
//    }

    public static void main(String[] args) {
//        ArrayList<String> newLst = new ArrayList<String>();
//        newLst.add("hi");
//        newLst.add("hi");
//        newLst.add("low");
//        newLst.add("hi");
//        newLst.add("hi");
//        newLst.add("hi");
//        newLst.add("Hi");
//        newLst.add("low");
//        newLst.add("lo");
//        newLst.add("hi");
//        System.out.println("ArrayList with duplicates: " + newLst);
//
//        ArrayList<String> newLst2 = removeDuplicates(newLst);
//        System.out.println("ArrayList with no duplicates: " + newLst2);

        Set<String> lst = new TreeSet<>();
        lst.add("hi");
        lst.add("hi");
        lst.add("low");
        lst.add("hi");
        lst.add("hi");
        lst.add("hi");
        lst.add("Hi");
        lst.add("low");
        lst.add("lo");
        lst.add("hi");
        System.out.println(lst);
    }
}
