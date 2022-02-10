
import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();             //taking value from user of a
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();             //taking value from user of b

        int diff = a - b;
        int sum = a + b;
        int multiply = a * b;
        int divide = a / b;

        System.out.println("Sum of a and b is " + sum);
        System.out.println("Difference of a and b is " + diff);
        System.out.println("Multiplication  of a and b is " + multiply);
        System.out.println("Division of a and b is " + divide);
    }
}
