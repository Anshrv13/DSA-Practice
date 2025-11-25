package Array_Question;

public class LastOccurrence {
    public static void main(String[] args) {
        int arr[]={4,5,6,6,6,7,7,8,8,9};
        int l =0, r=arr.length-1;
        int t=6;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==t){
                ans=mid;
                l=mid+1;
            }else if(arr[mid]>t){
                r=mid-1;
            }else{
                l=mid+1;
            }
    }
        System.out.println(ans);
    }
}
