package Array_Question;

public class CommonElement {
    public static void main(String[] args) {
        int num[]={5,30,30,20,50};
        int num2[]={6,3,20,60,30};
        int len= num2.length;
        if(num.length> num2.length){
            len= num.length;
        }
        int common[]=new int[len];
        int ind =0;
        for (int i = 0; i < len; i++){
            if(num[i] == num2[i]){
                common[ind++]=num[i];
            }
        }
        System.out.println("Common elements are ");
        for(int dt:common){
            System.out.println(common);
        }

    }
}
