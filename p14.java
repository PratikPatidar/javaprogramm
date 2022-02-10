
import java.util.Scanner;
public class p14
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter binary number:");

        String a=sc.nextLine();
        //Taking value as binary value
        int b=Integer.parseInt(a,2);


        System.out.print("Decimal number is:"+b);

    }
}
