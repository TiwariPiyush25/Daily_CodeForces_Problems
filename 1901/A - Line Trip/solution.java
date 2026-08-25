import java.util.Scanner;
 
public class Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
 
            int[] arr = new int[n];
            for (int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
 
            int maxCap = (arr[0] - 0);
            for (int i = 1;i < n;i++){
                int cap = arr[i] - arr[i-1];
                maxCap = Math.max(cap,maxCap);
            }
 
            maxCap = Math.max(maxCap , (x - arr[n-1]) * 2);
 
            System.out.println(maxCap);
        }
    }
}