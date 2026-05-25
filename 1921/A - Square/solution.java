import java.util.Scanner;
 
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0){
            int[][] arr = new int[4][2];
 
            for (int i = 0;i < 4; i++){
                for (int j = 0;j < 2; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
 
            int x = arr[0][0];
            int y = arr[0][1];
 
            int dist = 0;
            for (int i = 1;i < 4;i++){
                if (x == arr[i][0] || y == arr[i][1]){
                    int a = x - arr[i][0];
                    int b = y - arr[i][1];
                    dist = (int) Math.sqrt(a*a + b*b);
                }
            }
 
            System.out.println(dist * dist);
        }
    }
}