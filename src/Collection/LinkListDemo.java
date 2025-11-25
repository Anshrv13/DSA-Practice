package Collection;

import java.util.LinkedList;
// no random access
// duplicate value
//not indexed (using loop for get )
public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("Ram");
        linkedlist.add("Shyam");
        linkedlist.add("Sita");
        linkedlist.add("Gita");
        String first= linkedlist.getFirst();
        String last= linkedlist.getLast();
        System.out.println(" First element" + first);
        System.out.println(" Last element" + last);
        System.out.println(linkedlist.get(2));
    }
}
