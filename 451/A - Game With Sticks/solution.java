import java.util.Scanner;
 
public class Game_With_Sticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        System.out.println(Math.min(m,n) % 2 == 0? "Malvika" : "Akshat");
    }
}