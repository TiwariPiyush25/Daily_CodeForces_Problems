import java.util.Arrays;
import java.util.Scanner;
 
public class Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        int[] arr = new int[m];
 
        for (int i = 0;i < m;i++){
            arr[i] = sc.nextInt();
        }
 
        Arrays.sort(arr);
        int i = 0 , j = n - 1;
 
        int minDiff = Integer.MAX_VALUE;
        while (j < m){
            minDiff = Math.min(minDiff, arr[j] - arr[i]);
            i++;
            j++;
        }
 
        System.out.println(minDiff);
    }
}