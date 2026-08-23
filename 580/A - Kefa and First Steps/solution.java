import java.util.Scanner;
 
public class Kefa_and_First_Steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        int prev = 0;
        int maxlen = 0;
        int len = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= prev) {
                len++;
            } else {
                maxlen = Math.max(maxlen, len);
                len = 1;
            }
            prev = arr[i];
        }
 
        maxlen = Math.max(maxlen, len);
        System.out.println(maxlen);
    }
}