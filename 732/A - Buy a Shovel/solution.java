import java.util.Scanner;
 
public class Buy_a_Shovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int k = sc.nextInt();
        int r = sc.nextInt();
 
        int i;
        for (i = 1; i <= 10;i++){
            if (k * i % 10 == 0 || ((k * i) - r) % 10 == 0) break;
        }
 
        System.out.println(i);
    }
}