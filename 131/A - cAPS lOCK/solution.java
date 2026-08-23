import java.util.Scanner;
 
public class cAPS_lOCK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
 
        String temp = str.substring(1);
        String res = temp.toUpperCase();
 
        if (temp.equals(res)){
            String r = "";
 
            for (int i = 0;i < str.length();i++){
                if (Character.isUpperCase(str.charAt(i))){
                    r += Character.toLowerCase(str.charAt(i));
                }
                else {
                    r += Character.toUpperCase(str.charAt(i));
                }
            }
 
            str = r;
        }
 
        System.out.println(str);
    }
}