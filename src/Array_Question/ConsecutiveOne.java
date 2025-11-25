package Array_Question;

public class ConsecutiveOne {
    public static void main(String[] args) {
        int num[]={1,1,1,0,0,1,1,1,1,0};
        int maxcnt=0;
        int cnt=0;
        for(int dt:num){
            if(dt==1){
                cnt++;
                maxcnt=Math.max(cnt,maxcnt);
            }else{
                cnt=0;
            }
        }
        System.out.println("maximun Consecutive ome : "+ maxcnt);
    }
}
