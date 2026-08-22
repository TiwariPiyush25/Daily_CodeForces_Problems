import java.util.Arrays;
import java.util.Scanner;
 
public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int[] arr = new int[n];
        int sum = 0;
 
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
 
        Arrays.sort(arr);
        int currSum = 0;
        int i = n-1;
        for (;i >= 0;i--){
            currSum += arr[i];
            sum -= arr[i];
            if (currSum > sum){
                break;
            }
        }
 
        System.out.println(n - i);
    }
}