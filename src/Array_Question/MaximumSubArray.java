package Array_Question;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr={3,-4,2,1,-4,6,4,-9};
        int res= maxSubArray(arr);
        System.out.println(res);
    }
            public static int maxSubArray(int[] nums) {
                int n=nums.length;
                int max=Integer.MIN_VALUE;
                int sum=0;
                for(int i=0;i<n;i++){
                    sum+=nums[i];
                    max=Math.max(sum,max);
                    if(sum<0){
                        sum=0;
                    }
                }
                return max;

        }
}
