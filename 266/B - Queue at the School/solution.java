import java.util.Scanner;
 
public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //  no of students
        int t=sc.nextInt(); // time
 
        String s=sc.next();
        char[] arr = s.toCharArray();
        while(t-- > 0){
 
            for (int i = 1;i < arr.length;i++){
                if(arr[i] == 'G' && arr[i-1] == 'B'){
                    char c = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = c;
                    i++;
                }
            }
        }
 
        System.out.println(arr);
    }
}