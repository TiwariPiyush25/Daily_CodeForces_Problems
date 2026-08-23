import java.util.Arrays;
import java.util.Scanner;
 
public class Taxi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
 
        int[] arr = new int[5];
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
 
            arr[x]++;
        }
 
        int taxi = arr[4];
 
        int min = Math.min(arr[1],arr[3]);
        taxi += min;
        arr[1] -= min; arr[3] -= min;
 
        taxi += arr[3];
 
        taxi += (arr[2] / 2);
        arr[2] = arr[2] % 2;
 
        if (arr[2] > 0){
            if (arr[1] > 0) {
                arr[1] = Math.max(0 , arr[1] - 2);
                taxi++;
            }
            else {
                taxi++;
            }
        }
 
        taxi += arr[1] / 4;
        if (arr[1] % 4 != 0) taxi ++;
 
        System.out.println(taxi);
    }
}