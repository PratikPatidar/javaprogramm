
import java.util.Scanner;
public class p16
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary number:");
        String a=sc.nextLine();
        int b=Integer.parseInt(a,2);
        String c=Integer.toHexString(b);
        System.out.print("Hexadecimal numbers:"+c);

    }
}
