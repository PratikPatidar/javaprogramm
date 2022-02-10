
import java.util.Scanner;
public class p20
{
    public static void main(String[] args) {

        int n, firstTerm = 0, secondTerm = 1;  
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a number till you want fibonacci series: ");
        n = sc.nextInt();
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ",");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
