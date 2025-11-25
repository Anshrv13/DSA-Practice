package Array_Question;

public class MissingNumber {
    public static void main(String[] args) {
        int[]num={1,2,3,4,5,6,7,8,10};
        int n= num.length+1;
        int sum=0;
        for(int dt:num){
            sum+=dt;
        }
        int expected=n*(n+1)/2;
        System.out.println("Missing number is  :"+(expected-sum));
    }
}
