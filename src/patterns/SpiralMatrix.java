package patterns;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n=5;
        int l=0,r=n-1,top=0,bot=n-1;
        int cnt=1;
        int arr[][]=new int[n][n];
        while(l<=r && top<=bot){
            for(int ft=l;ft<=r;ft++){
                arr[top][ft]=cnt++;
            }
            top++;
            for(int sn=top;sn<=bot;sn++){
                arr[sn][r]=cnt++;
            }
            r--;
//            if(top<=bot) {
                for (int td = r; td >= l; td--) {
                    arr[bot][td] = cnt++;
                }
                bot--;

//            if(l<=r) {
                for (int fr = bot; fr >= top; fr--) {
                    arr[fr][l] = cnt++;
                }
                l++;
//            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
