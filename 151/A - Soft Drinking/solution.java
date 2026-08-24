import java.util.Scanner;
 
public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // No. of friends
        int k=sc.nextInt(); // no. of bottle
        int l=sc.nextInt(); // milliliters of drink
        int c=sc.nextInt(); // limes
        int d=sc.nextInt(); // no of slices
        int p=sc.nextInt(); // gram of salt
        int nl=sc.nextInt(); // needed drinks
        int np=sc.nextInt(); // needed gram of salt
 
        int totalDrink = k * l;
        int totalSalt = p;
        int totalSlices = c * d;
 
        System.out.println(Math.min(totalDrink / (n * nl),Math.min(totalSalt / (n * np), totalSlices / n)));
    }
}