import java.util.HashMap;
import java.util.Scanner;
 
public class Registration_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        HashMap<String,Integer> map = new HashMap<>();
        while (n-- > 0){
            String s = sc.next();
 
            if (!map.containsKey(s)){
                System.out.println("OK");
                map.put(s , 1);
            }
            else {
                System.out.println(s + map.get(s));
                map.put(s , map.get(s) + 1);
            }
        }
    }
}