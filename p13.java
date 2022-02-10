
import java.util.Scanner;
public class p13
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter hexadecimal number:");
        String a=sc.nextLine();
        int b=Integer.parseInt(a,16);
        String c=Integer.toBinaryString(b);
        System.out.print("Binary numbers:"+c);

    }
}
