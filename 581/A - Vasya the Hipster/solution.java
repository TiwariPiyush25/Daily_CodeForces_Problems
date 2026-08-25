import java.util.Scanner;
 
public class Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
 
        int min = Math.min(a, b);
        a -= min; b -= min;
 
        System.out.println(min + " " + ((a > 0) ? a / 2 : b / 2));
    }
}