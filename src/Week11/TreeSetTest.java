package Week11;

import java.util.*;

public class TreeSetTest {

	public static void main(String[] args) {
		// First set up a test set - notice difference in the order
		
//		Set<String> names = new TreeSet<>();
//		names.add("Cory");
//		names.add("Drake");
//		names.add("Bob");
//		names.add("Aiden");
//
//
//		System.out.println(names);
//
//		if (names.contains("Bob")) {
//			names.remove("Bob");
//		}
//		//Note this is an Iterator and not a ListIterator
//		Iterator<String> iterator = names.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(5);
		treeSet.add(3);
		treeSet.add(6);
		treeSet.add(10);
		System.out.println(treeSet);

		Map<String, Integer> treeMap = new TreeMap<>();

		for (int element : treeSet)
		{
			treeMap.put(element + "", element);
		}
		System.out.println(treeMap);



//		
//		for (String element : names) {
//			System.out.println(element);
//		}

	}

}
