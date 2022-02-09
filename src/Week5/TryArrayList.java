package Week5;

import java.util.ArrayList;

public class TryArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        System.out.println(lst);
        lst.add(1);
        lst.add(2);
        System.out.println(lst);
        ArrayList<String> strLst = new ArrayList<>();
        strLst.add("hi");
        strLst.add("there");
        System.out.println(strLst);
        strLst.add(1, "not");
        System.out.println(strLst);
        //strLst.remove("not");
        //strLst.remove(1);
        //System.out.println(strLst);
        System.out.println(strLst.contains("note"));
    }
}
