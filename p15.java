
import java.util.Scanner;
public class p15
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the binary number:");
        String b=sc.nextLine();
        int c=Integer.parseInt(b,2);
        String d=Integer.toOctalString(c);

        System.out.print("Octal number is :"+d);

    }
}
