import java.util.Scanner;
 
public class Theater_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        Long m=sc.nextLong();
        Long a=sc.nextLong();
 
        long r = n / a;
        long c = m / a;
 
        long total = r * c;
        if(n % a != 0) total += (m/a);
        if(m % a != 0) total += (n/a);
        if(n % a != 0 && m % a != 0) total++;
 
        System.out.println(total);
    }
}