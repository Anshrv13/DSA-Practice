package Array_Question;

public class BothFirstLastOccurrence {
    public static void main(String[] args) {

            int nums[]={4,5,6,6,7,7,8,8,10};
            int target=7;
                int n=nums.length;
                int l=0,r=n-1;
                int ansf=-1;
                int ansr=-1;
                while(l<=r){
                    int mid=l+(r-l)/2;
                    if(nums[mid]== target){
                        ansf=mid;
                        r=mid-1;
                    }else if(nums[mid]>target) r=mid-1;
                    else l=mid+1;
                }
                l=0;
                r=n-1;
                while(l<=r){
                    int mid=l+(r-l)/2;
                    if(nums[mid]==target){
                        ansr=mid;
                        l=mid+1;
                    }else if(nums[mid]>target) r=mid-1;
                    else l=mid+1;
                }
        System.out.println(ansf+"  "+ ansr);
    }
}
