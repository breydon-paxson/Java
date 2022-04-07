package Week11.Homework;

import java.util.HashSet;
import java.util.Set;

public class BookTester {

    public static void main (String[] args) {
        Book bk1 = new Book("The Story", "Joe Doe", 123);
        Book bk2 = new Book ("Sports 101", "Sam Spade", 345);
        Book bk3 = new Book ("Nancy Drew", "Rose Bush", 323);
        Book bk4 = new Book ("Nancy Drew", "Rose Bush", 323);

		System.out.println(bk1.hashCode());
		System.out.println(bk2.hashCode());
        System.out.println(bk3.hashCode());
        System.out.println(bk4.hashCode());





        Set<Book> set = new HashSet<Book>();
        set.add(bk3);
        set.add(bk4);
        System.out.println(set);

        System.out.println("bk3.equals(bk4): " + bk3.equals(bk4));

    }

}
