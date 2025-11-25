package Array_Question;

public class MaxMin {
    public static void main(String[] args) {
        int [] arr=new int[]{44,20,21,10,38,39};
        int max=arr[0];
        int min= arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min ){

                min=arr[i];
            }
        }
        System.out.println("max"+max);
        System.out.println("min"+min);
    }

}
