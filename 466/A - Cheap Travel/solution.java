import java.util.Scanner;
 
public class Cheap_Travel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
 
        int sum1 = n * a;
        int sum2 = 0;
        if (n >= m) sum2 = (n / m) * b + Math.min(b , (n % m) * a);
        else sum2 = b;
 
        System.out.println(Math.min(sum1 , sum2));
    }
}