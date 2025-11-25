package Array_Question;

public class twoSum {
    public static void main(String[] args) {
        int [] arr={3,4,2,6,7,5};
        int t=11;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]+arr[j]== t ){
                    System.out.println("Sum of Target "+t+" element are :"+ arr[i]+arr[j]+" = "+(arr[i]+arr[j])+" index are "+i+"  "+j );
                }
            }
        }
    }
}
