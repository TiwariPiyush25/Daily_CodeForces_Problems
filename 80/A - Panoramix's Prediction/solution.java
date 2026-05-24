import java.util.Arrays;
import java.util.Scanner;
 
public class Panoramixs_Prediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
 
        int[] Primes = new int[b + 1];
        Arrays.fill(Primes,1);
 
        for (int i=2 ; i*i<=b ; i++){
            if (Primes[i]==1){
                for (int j = i*i; j<=b; j+=i){
                    Primes[j] = 0;
                }
            }
        }
 
        if (Primes[b] != 1) System.out.println("NO");
        else {
            boolean flag = true;
            for (int i = a+1;i < b;i++){
                if (Primes[i] == 1){
                    flag = false;
                    break;
                }
            }
 
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}