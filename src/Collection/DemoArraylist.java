package Collection;

import java.util.ArrayList;
import java.util.List;

public class DemoArraylist {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(1,40);
        num.add(10);


        System.out.println(num.get(2));
        if(num.isEmpty()){
            System.out.println("its empty");
        }else{
            System.out.println(num);
        }
    }
}
