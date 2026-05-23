import java.util.Scanner;
 
public class Good_Kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
 
            for (int i  = 0;i < n; i++){
                arr[i] = sc.nextInt();
            }
 
            int min = Integer.MAX_VALUE;
            for (int ele : arr){
                min = Math.min(ele , min);
            }
 
            long Product = 1L;
            boolean flag = true;
            for (int ele : arr){
                if (flag && ele == min){
                    Product = Product * (min + 1);
                    flag = false;
                }
                else {
                    Product = Product * ele;
                }
            }
 
            System.out.println(Product);
        }
    }
}