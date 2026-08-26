import java.util.Scanner;
 
public class Xenia_and_Ringroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
 
        for (int i = 0;i < m;i++){
            arr[i] = sc.nextInt();
        }
 
        long time = arr[0] - 1;
 
        for (int i = 1;i < m;i++){
            if (arr[i] >= arr[i-1]) time += (arr[i] - arr[i-1]);
            else {
                long diff = n - arr[i-1]; // move to last house circularly
                time += (diff + arr[i]);
            }
        }
 
        System.out.println(time);
    }
}