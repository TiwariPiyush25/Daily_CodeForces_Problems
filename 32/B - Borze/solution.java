import java.util.Scanner;
 
public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
 
        int i = 0;
        String ans = "";
        while (i < s.length()){
            if (s.charAt(i) == '.'){
                ans += 0;
                i++;
            }
            else {
                if (s.charAt(i+1) == '.'){
                    ans += 1;
                }
                else{
                    ans += 2;
                }
                i += 2;
            }
        }
 
        System.out.println(ans);
    }
}