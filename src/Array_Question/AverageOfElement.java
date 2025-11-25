package Array_Question;

public class AverageOfElement {
    public static void main(String[] args) {
        int num[]={20,40,43,53,12};
        int sum=0;
        for (int i = 0; i <num.length ; i++) {
            sum+=num[i];
        }
        int avg=sum/num.length;
        System.out.println(" Average is "+avg);
    }
}
