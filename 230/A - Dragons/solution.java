import java.util.Arrays;
import java.util.Scanner;
 
public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
 
        int[][] arr = new int[n][2];
        int i = 0;
        while (i < n){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            i++;
        }
 
        Arrays.sort(arr,(a,b) -> a[0] - b[0]);
        boolean flag = true;
 
        for (i = 0;i < n;i++){
            if (s <= arr[i][0]) {
                flag = false;
                break;
            }
 
            s += arr[i][1];
        }
 
        System.out.println(flag ? "YES" : "NO");
    }
}