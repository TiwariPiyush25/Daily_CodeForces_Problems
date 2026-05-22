import java.util.Scanner;
 
public class DBMB_and_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int x = sc.nextInt();
 
            int sum = 0;
            for (int i = 0;i < n;i++){
                sum += sc.nextInt();
            }
 
            System.out.println(sum <= s && ((s - sum)% x == 0)? "YES" : "NO");
        }
    }
}