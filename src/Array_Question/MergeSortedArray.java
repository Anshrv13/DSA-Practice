package Array_Question;

public class MergeSortedArray {
    static int [] getMergeSorted(int arr1[],int arr2[]){
        int n= arr1.length;
        int n2= arr2.length;
        int[] ans=new int[n+n2];
        int i=0,j=0,ind=0;
        while(i<n && j<n2){
            if(arr1[i]<arr2[j]){
                ans[ind++]=arr1[i++];
            }else {
                ans[ind++]=arr2[j++];
            }
        }
        while(i<n){
            ans[ind++]=arr1[i++];
        }
        while(j<n2){
            ans[ind++]=arr2[j++];
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] num1= {1,3,5};
        int [] num2= {2,6,7};
        int [] arr = getMergeSorted(num1,num2);
        for(int i : arr){

        System.out.println(i);
        }
    }
}
