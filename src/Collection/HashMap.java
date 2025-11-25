package Collection;

import java.util.Map;
//duplicate key are not allowed
//no Ordered
//if 2 same key are there then 2nd  value will be set in duplicate key
// null is also a key which store 1 value
public class HashMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new java.util.HashMap<>();
        map.put("ansh",23);
        map.put("rohit",53);
        map.put("kohli",18);
        map.put("ronaldo",7);
        System.out.println(map.get("ronaldo"));
        if(map.containsKey("ansh")){
            System.out.println(map.get("ansh"));
        }
        //ForEach
        for(String data: map.keySet()){
            System.out.println("Keys are  " + data + "  Value  "+map.get(data));

        }

        for(Integer value: map.values()){
            System.out.println(value);
        }
    }
}
