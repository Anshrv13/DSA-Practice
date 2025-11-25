package Array_Question;

public class ThreeGreatQ29 {
    public static void main(String[] args) {
        int num[]= {2,6,4,7,8,12};
        int max=num[0],smax=num[0], tmax=num[0];
        for (int i = 0; i < num.length ; i++) {
            if(num[i]>max){
                tmax=smax;
                smax=max;
                max=num[i];

            }
            else if(num[i]>smax && num[i]<max){
                tmax=smax;
                smax=num[i];
            }else if(num[i]>tmax && num[i]<smax){
                tmax=num[i];
            }
        }
        System.out.println(" max "+ max);
        System.out.println(" 2 max "+ smax);
        System.out.println(" 3 max "+ tmax);
    }
}
