package Array_Question;

public class leftShiftInArray {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5};
        int tmp=  num[0];
        for(int i=0;i<num.length;i++){
            if(i == num.length-1){

                System.out.println("if"+num[i]);
                num[i]=tmp;

            }else{

                System.out.println("else"+num[i]);
                num[i]=num[i+1];

            }
        }
        for(int dt:num){
            System.out.println(dt);
        }
    }
}
