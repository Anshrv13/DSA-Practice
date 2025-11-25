package Array_Question;

import java.util.HashMap;
import java.util.Map;

public class NumberRepeation {
    public static void main(String[] args) {
        int num[] = {4, 20, 30, 4, 3, 4, 2, 3, 6};
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:num){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        for(int dt: map.keySet()){
            System.out.println(dt+" is repeated by  "+map.get(dt) +" times");
        }


    }
}
