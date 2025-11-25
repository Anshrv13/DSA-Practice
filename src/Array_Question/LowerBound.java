package Array_Question;

public class LowerBound {
    public static void main(String[] args) {
        int arr[]={3,5,5,7,7,8,8,9};
        int l =0, r=arr.length-1;
        int t=7;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=t){
                ans=mid;
                r=mid-1;
            }else l=mid+1;
        }
        System.out.println(ans);
    }
}
