package Array_Question;

import java.util.jar.JarOutputStream;

public class SecoundLargest {
    public static void main(String[] args) {
        int[] arr= new int[5];
        int [] arr1=new int[]{40,20,21,10,43};
        int max=-1;
        int sec = -2;
        for(int i=0; i<arr1.length ;i++){
            System.out.println(arr1[i]);
            if(arr1[i]>max){
                max=arr1[i];
            } else if (arr[i]<max && arr[i]>sec) {
                sec=max;
            }
        }
        System.out.println("MAX:"+ max);
        System.out.println("SECOUND MAX:"+ sec);

    }

}
