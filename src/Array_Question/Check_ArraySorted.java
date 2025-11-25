package Array_Question;

public class Check_ArraySorted {
    public static void main(String[] args) {
//        int f=num[0];
//        int f2=num[0];
//        int cnt=0,ct=0;
//        for (int i =1;i< num.length;i++){
//            if(num[i]>=f){
//                f=num[i];
//                cnt++;
//            }
//            if(num[i]<=f2){
//                f2=num[i];
//                ct++;
//            }
//        }
//        System.out.println(num.length);
//        System.out.println(cnt);
//        int lim= num.length-1;
//        if(cnt == lim || ct == lim){
//            System.out.println("Array is sorted");
//        }
        int num[]={2,21,24,32,50};
        boolean asc=true;
        boolean desc=true;
        for (int i = 1; i < num.length ; i++) {
            if(num[i-1]>num[i]){
                asc=false;
            }
            if(num[i-1]<num[i]){
                desc=false;
            }
        }
        if(asc){
            System.out.println("Ascending Sorting");
        }
        if(desc){
            System.out.println("Descending Sorting");
        }
    }
}
