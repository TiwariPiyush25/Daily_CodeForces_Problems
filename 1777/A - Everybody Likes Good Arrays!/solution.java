import java.util.Scanner;
 
public class Everybody_Likes_Good_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
 
            for (int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
 
            int opr = 0;
 
            int i = 0;
            int j = 0;
            for (j = 0;j < n;j++){
                if ((arr[i]%2==0 && arr[j]%2==0) || (arr[i]%2!=0 && arr[j]%2!=0)) continue;
                else {
                    opr += (j-i) - 1;
                    i = j;
                }
            }
 
            if (!(arr[i]%2==0 && arr[j-1]%2==0) || !(arr[i]%2!=0 && arr[j-1]%2!=0)) {
                opr += (j-i) - 1;
            }
 
 
            System.out.println(opr);
        }
    }
}