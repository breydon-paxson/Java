package Week11.Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HmPrb1 {
    public static void main(String[] args) {
        Map<String, Integer> test = new HashMap<String, Integer>();
        test.put("A", 1);
        test.put("B", 2);
        test.put("A", 2);
        test.put("C", 3);
        System.out.println(test);

        Map<Map<String, Integer>, Integer> hashMap = new HashMap<Map<String, Integer>, Integer>();
        Map<String, Integer> test2 = new HashMap<String, Integer>();
        test2.put("A", 5);
        test2.put("B", 8);
        test2.put("C", 13);
        hashMap.put(test, 1);
        hashMap.put(test2, 4);
        System.out.println(hashMap);

        Set<String> keys = test.keySet();
        for (String key : keys) {
            System.out.println("keys is " + key + " value is " + test.get(key));

        }
    }
}
