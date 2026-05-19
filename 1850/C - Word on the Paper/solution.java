import java.util.Scanner;
 
public class Word_on_the_Paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0){
            String ans = "";
            for(int i = 0;i < 8;i++){
                String row = sc.next();
                for (int j = 0;j < 8;j++){
                    char c = row.charAt(j);
                    if(c >= 'a' && c <= 'z') ans += c;
                }
            }
 
            System.out.println(ans);
        }
    }
}