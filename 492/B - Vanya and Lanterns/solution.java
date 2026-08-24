import java.util.Arrays;
import java.util.Scanner;
 
public class Vanya_and_Lanterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
 
        int[] arr = new int[n];
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
 
        Arrays.sort(arr);
        double d = Math.max(arr[0] - 0, l - arr[n - 1]);
 
        for (int i = 1; i <= n - 1; i++) {
            d = Math.max(d, ((double) arr[i] - (double) arr[i - 1]) / 2D);
        }
 
 
        System.out.printf("%.9f",d);
    }
}