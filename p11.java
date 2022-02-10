

import java.util.Scanner;
public class p11 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal numbers:");

        int b=sc.nextInt();

        String c=Integer.toBinaryString(b);

        System.out.print("Binary numbers:"+c);

    }
}
