import java.util.Arrays;
import java.util.Scanner;
 
public class Cut_Ribbon {
    public static int cutRibbon(int len,int a,int b,int c,int[] dp){
        if (len == 0) return 0;
        if (len < 0) return Integer.MIN_VALUE;
 
        if (dp[len] != -1) return dp[len];
        int peicesA = cutRibbon(len - a ,a ,b ,c ,dp);
        int peicesB = cutRibbon(len - b ,a ,b ,c ,dp);
        int peicesC = cutRibbon(len - c ,a ,b ,c ,dp);
 
        return dp[len] = 1 + Math.max(peicesA , Math.max(peicesB , peicesC));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        int[] dp = new int[n + 1];
        Arrays.fill(dp,-1);
 
        int ans = cutRibbon(n,a,b,c,dp);
        System.out.println(ans);
    }
}