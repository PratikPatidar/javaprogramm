
import java.util.Scanner;
public class p19
{
    public static void main(String[] args)
    {
        Double num;         //assigning the number
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextDouble(); //taking input of the number

        Double squareroot = Math.pow(num, 0.5);
        //inbuild function for finding squareroot of the number
        System.out.println("The Square of a Given Number  " + num + "  =  " + squareroot);
    }
}
