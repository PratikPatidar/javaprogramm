
import java.util.Scanner;
public class p10 {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first term of Equation:");
        double a=sc.nextDouble();

        System.out.print("Enter the second term of Equation:");
        double b=sc.nextDouble();

        System.out.print("Enter the third term of Equation:");
        double c=sc.nextDouble();

        double D=(b*b)-(4*a*c);
        if (D>0)
        {
            double first_root=(-b+Math.sqrt(D))/(2*a);
            double second_root=(-b-Math.sqrt(D))/(2*a);
            System.out.println( "First Root of the Equation is"+ first_root);
            System.out.println( "Second Root of the Equation is"+ second_root);
        }

        else if (D==0){
            double equal_root=(-b+Math.sqrt(D))/(2*a);
            System.out.println( "Equal Roots is:"+ equal_root);
        }

        else
        {
            System.out.println( "Roots are imaginary.");
        }
    }
}
