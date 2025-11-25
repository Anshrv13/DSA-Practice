package Array_Question;

import java.util.HashMap;
import java.util.Map;

public class Frequency_in_array {
    public static void main(String[] args) {

        char arr[]= new char[]{'a', 'b','a', 'c', 'd','s', 'r', 'x', 'a', 'c'};
        Map<Character,Integer> map= new HashMap<>();
        for(char key : arr){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        for(char ch: map.keySet()){
            System.out.println(ch+"  :"+map.get(ch));
        }
    }
}
