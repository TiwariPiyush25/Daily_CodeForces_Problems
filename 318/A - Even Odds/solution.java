import java.util.Scanner;
 
public class Even_Odds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
 
        long mid = (n+1)/2;
        if (k <= mid){
            System.out.println(1 + (k-1) * 2);
        }
        else {
            System.out.println(2 + (k - mid - 1) * 2);
        }
    }
}