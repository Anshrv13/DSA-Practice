package Array_Question;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingSet {
    public static void main(String[] args) {
        int arr[]={20,10,10,20,30,40,20};
        Set<Integer> st= new HashSet<>();
        for(int num:arr){
            st.add(num);
        }
        int[] arr2=new int[st.size()];
        int ind=0;
        for(int num: st){
            arr2[ind++]=num;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("Array with duplicate"+arr[i]);
        }for(int i=0;i<arr2.length;i++){
            System.out.println("Array withOut duplicate"+arr2[i]);
        }
    }
}
