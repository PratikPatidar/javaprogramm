
import java.util.Scanner;
public class p12 {
public static void main(String[] args)
        {
        Scanner a=new Scanner(System.in);

        System.out.print("Enter octal number:");
        String b=a.nextLine();
        int c=Integer.parseInt(b,8);
        String d=Integer.toBinaryString(c);
        System.out.print("Binary numbers:"+d);

        }
        }
