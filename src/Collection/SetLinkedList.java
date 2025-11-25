package Collection;

import java.util.LinkedHashSet;
import java.util.Set;
//ordered(maintain the inserted ordered)
// no duplicate value
public class SetLinkedList {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(40);
        set.add(60);
        set.add(30);
        set.add(20);
        set.add(50);
        System.out.println(set);
    }
}
