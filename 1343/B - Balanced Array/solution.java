import java.util.Scanner;
 
public class Balanced_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0){
            int n = sc.nextInt();
 
            if ((n/2) % 2 != 0){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
                int cnt = 0;
                int x = 2;
                int sum = 0;
                while (cnt < n/2){
                    sum += x;
                    System.out.print(x+" ");
                    x += 2;
                    cnt++;
                }
 
                cnt = 0;
                x = 1;
 
                int currSum = 0;
                while (cnt < (n/2)-1){
                    currSum += x;
                    System.out.print(x +" ");
                    x += 2;
                    cnt++;
                }
 
                System.out.println(sum - currSum);
            }
        }
    }
}