import java.util.Arrays;
import java.util.Scanner;
 
public class T_Primes {
    public static long find(long x){
        long st = 1;
        long end = x;
 
        long ans = -1;
        while (st <= end){
            long mid = st + (end - st) / 2;
 
            if (mid <= x / mid){
                ans = mid;
                st = mid + 1;
            }
            else end = mid - 1;
        }
 
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
 
        int[] Prime = new int[1000001];
        Arrays.fill(Prime,1);
        Prime[1] = 0;
 
        for (int i = 2;i * i<= 1000000;i++){
            if (Prime[i] == 1){
                for (int j = i*i;j <= 1000000;j += i){
                    Prime[j] = 0;
                }
            }
        }
 
        while (n-- > 0){
            long x = sc.nextLong();
 
            int sqrt = (int) find(x);
 
            if ((long) sqrt * (long) sqrt == x && Prime[sqrt] == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}