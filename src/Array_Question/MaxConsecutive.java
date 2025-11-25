package Array_Question;

import java.util.HashSet;
import java.util.*;

public class MaxConsecutive {
    public static  void main(String[] args) {
        int num[]={4,3,2,5,7,9,21};
        Set<Integer> st=new HashSet<>();
        Map<Integer,Integer> mp= new HashMap<>();
        int n=num.length;
        int max=0;
        for(int dt : num){
            st.add(dt);
        }
        for (int i = 0; i <n ; i++) {
            int value=num[i];

            int len=0,nlen=0;
            if(mp.containsKey(value)){
                continue;
            }
            while(st.contains(value)){
                if(mp.containsKey(value)){
                    nlen=mp.get(value);
                    len=nlen+len;
                    break;
                }
                len++;
                mp.put(value,0);
                value++;
            }
            mp.put(num[i],len);
            max=Math.max(max,len);
        }
        System.out.println("Maximum consecutive value is "+max);

    }
}
