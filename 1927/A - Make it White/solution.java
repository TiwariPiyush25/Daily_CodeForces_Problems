import java.util.Scanner;
 
public class Make_it_White {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
 
            int firstidx = -1;
            int lastidx = -1;
 
            boolean flag = true;
            for (int i = 0;i < n;i++){
                if (s.charAt(i) == 'B') {
                    if (flag) {
                        firstidx = i;
                        flag = false;
                    }
                    lastidx = i;
                }
            }
 
            System.out.println(lastidx - firstidx + 1);
        }
    }
}