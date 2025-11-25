package Collection;
import java.util.*;
// random access
//duplicate value
// unordered
// indexed
//iterator works for all, it traverse and can also remove elements
public class ArrayList {
    public static void main(String[] args) {
        List<Integer> li = new java.util.ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("enter element " + i);
            int x = sc.nextInt();
            li.add(x);
        }
        if(li.isEmpty()){
            System.out.println("Empty");
        }else{
            System.out.println(li);
        }
        //li.clear();

        if(li.isEmpty()){
            System.out.println("Empty");
        }else{
            System.out.println(li);
        }
        Iterator<Integer> ite = li.iterator();

        while(ite.hasNext()){
            int data = ite.next();
            if(data==20){
                System.out.println(" Removing ");
                ite.remove();
            }
            else{
                System.out.println(data);
            }
        }
    }
}
