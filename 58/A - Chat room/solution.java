import java.awt.*;
import java.util.Scanner;
 
public class Chat_Room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
 
        int n = str.length();
        String target = "hello";
        int j = 0;
        for(int i = 0;i < n;i++){
            if(target.charAt(j) == str.charAt(i)){
                j++;
            }
            if(j == 5) break;
        }
 
        System.out.println(j == 5 ? "YES" : "NO");
    }
}