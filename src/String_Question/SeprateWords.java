package String_Question;

public class SeprateWords {
    public static void main(String[] args) {
        String obj = new String("Hi i am ansh");
        System.out.println(obj);
        String st="Hello all good";
        String str="";
        String[] wd= st.split(" ");
        for (int i = 0; i <wd.length ; i++) {
            str= wd[i] + str;
        }
        
        System.out.println(str);


    }
}
