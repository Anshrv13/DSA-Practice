package Array_Question;

public class Sort012_31 {
    public static void main(String[] args) {
        int [] num={2,1,2,1,0,0,1,2};
        int n= num.length;
        int zf=0,sl=n-1;
        int cr=0;
        while(cr<=0){
            int value=num[cr];//int 0(2),0(2),0(1),1(1),2(2),2(0),
            if(value==0){//zf=0(1)-0
                int tmp=num[cr];//0
                num[cr]=num[zf];//1
                num[zf]=tmp;//0
                zf++;//1(1)
                cr++;
            }
            else if(value==1){
                cr++;
            }
            else {//sl = 7
                int tmp=num[cr];//2,2
                num[cr]=num[sl];//2,1
                num[sl]=tmp;//2,2
                sl--;//sl 6(1)-2 , 5(0)-2, 4(0)
            }
        }
        for(int dt:num){
            System.out.println(dt);
        }

    }
}
