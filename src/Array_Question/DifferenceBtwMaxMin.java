package Array_Question;

public class DifferenceBtwMaxMin {
    public static void main(String[] args) {
        int num[]={5,30,30,20,50,40,2};
        int max=num[0];
        int min=num[0];
        for (int i=1;i< num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("The difference between max and min is :"+ (max-min));
    }
}
