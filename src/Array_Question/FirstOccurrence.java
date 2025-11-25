package Array_Question;

public class FirstOccurrence {
    public static void main(String[] args) {
        int arr[]={4,5,6,6,6,7,7,8,8,9};
        int l =0, r=arr.length-1;
        int t=6;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==t){
                ans=m;
                r=m-1;
            }else if(arr[m]>t) r=m-1;
            else l=m+1;
        }
        System.out.println(ans);
    }
}
