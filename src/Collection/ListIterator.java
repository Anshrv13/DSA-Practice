package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("ansh","ram","shyam","Shiv","Sita"));
        java.util.ListIterator<String> li = list.listIterator();
        System.out.println("Forward printing");
        while(li.hasNext()){
            String data= li.next();
            System.out.println(data);
            if(data.equals("ansh")){
                li.set("Vishnu");
            }
        }
        System.out.println("Backward printing");
        while(li.hasPrevious()){
            String data=li.previous();
            System.out.println(data);
        }
    }
}
