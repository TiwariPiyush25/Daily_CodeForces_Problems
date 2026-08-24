import java.util.Scanner;
 
public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int[] arr = new int[n];
 
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
 
        int pol = 0;
        int cri = 0;
        int untCri = 0;
        for (int i = 0;i < n;i++){
            int x = arr[i];
 
            if (x == -1) {
                if (pol > 0) pol--;
                else untCri++;
            }
            else {
                pol += x;
            }
 
        }
        System.out.println(untCri);
    }
}