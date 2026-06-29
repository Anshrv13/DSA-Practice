package String_Question;

public class RomanToNumber {
    public int romanToInt(String s) {
        int ans=0;
        if(s.length()==1) return getvalue(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(getvalue(s.charAt(i-1)) < getvalue(s.charAt(i)) ){
                int l=getvalue(s.charAt(i-1));
                int r=getvalue(s.charAt(i));
                int val=r-l;
                ans+=val;
                i++;
            }else{
                char ch=s.charAt(i-1);
                int val=getvalue(ch);
                ans+=val;
            }
        }
        if(getvalue(s.charAt(s.length()-2)) >= getvalue(s.charAt(s.length()-1)) ){
            ans+=getvalue(s.charAt(s.length()-1));
        }
        return ans;
    }
    int getvalue(char ch){
        if(ch=='I') return 1;
        else if(ch=='V') return 5;
        else if(ch=='X') return 10;
        else if(ch=='L') return 50;
        else if(ch=='C') return 100;
        else if(ch=='D') return 500;
        else if(ch=='M') return 1000;
        return 0;
    }
}
