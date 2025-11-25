package Collection;

import java.util.HashSet;
import java.util.Set;
//Dont allow duplicate value
// no random access
// no ordered
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(12);
        set.add(32);
        set.add(40);
        set.add(23);
//        set.add(32);
        set.add(50);
        System.out.println(set);


    }
}
