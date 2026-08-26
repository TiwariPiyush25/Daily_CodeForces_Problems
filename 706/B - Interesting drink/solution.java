import java.util.Arrays;
import java.util.Scanner;
 
public class Interesting_drink {
    public static int search(int[] arr,long target){
        int st = 0;
        int end = arr.length - 1;
 
        int ans = 0;
        while (st <= end){
            int mid = st + (end - st) / 2;
 
            if (arr[mid] <= target){
                ans = mid + 1;
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
 
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int[] X = new int[n];
        for (int i = 0;i < n;i++){
            X[i] = sc.nextInt();
        }
 
        Arrays.sort(X);
 
        int q = sc.nextInt();
        for (int i = 0;i < q;i++){
            long m = sc.nextLong();
 
            int noOfDays = search(X,m);
 
            System.out.println(noOfDays);
        }
 
 
    }
}