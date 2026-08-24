import java.util.Arrays;
import java.util.Scanner;
 
public class Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0;i < 4;i++){
            arr[i] = sc.nextInt();
        }
 
        Arrays.sort(arr);
 
        int max = arr[3];
        int c = max - arr[2];
        int b = max - arr[1];
        int a = max - arr[0];
 
        System.out.println(a+" "+b+" "+c);
    }
}