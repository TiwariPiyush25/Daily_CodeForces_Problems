import java.util.Scanner;
 
public class Array_with_Odd_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
 
            for (int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
 
            boolean flag = false;
            if (n % 2 == 0) {
                boolean even = false , odd = false;
                for (int ele:arr) {
                    if (ele % 2 == 0) even = true;
                    else odd = true;
                }
                if (even && odd) flag = true;
            }
            else {
                boolean odd = false;
                for (int ele:arr){
                    if (ele % 2 != 0) odd = true;
                }
                if (odd) flag = true;
            }
 
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}