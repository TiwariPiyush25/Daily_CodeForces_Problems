import java.util.Scanner;
 
public class Fafa_and_his_Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int ways = 0;
        for(int leader = 1;leader <= n/2;leader++){
            int rem = n - leader;
 
            if (rem % leader == 0) ways++;
        }
 
        System.out.println(ways);
    }
}