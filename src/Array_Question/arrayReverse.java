package Array_Question;

public class arrayReverse {
    public static void main(String[] args) {
        int num[]={32,21,54,32,50};
        int i=0;
        int j= num.length-1;
        while(i<j){
            int t=num[i];
            num[i]=num[j];
            num[j]=t;
            i++;
            j--;
        }
        System.out.println("After Reverse ");
        for(int n:num){
            System.out.println(n);
        }
    }
}
