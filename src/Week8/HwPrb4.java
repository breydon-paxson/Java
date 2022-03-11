package Week8;

import java.util.ArrayList;
import java.util.Arrays;

public class HwPrb4 {
    public static int mystery(ArrayList<String> strings, String target, int position){
        if (position < strings.size()) {
            if (strings.get(position).equals(target))
                return position;
            else
                return mystery(strings, target, position + 1);
        } else
            return -1;
    }

    public static void main(String[] args) {
        String[] temp = {"how", "now", "brown", "cow"};
        ArrayList x = new ArrayList<String>(Arrays.asList(temp));
        System.out.println(mystery(x, "brown", 2));
    }
}
