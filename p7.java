
    import java.util.*;
    public class p7 {

        public static void main(String[] args)
        {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the value of a:");
            int a=sc.nextInt();

            System.out.print("Enter the value of b:");
            int b=sc.nextInt();


            System.out.print("Enter the value of c:");
            int c=sc.nextInt();
            if(a<b&&a<c)
            {
                System.out.println("Number a is the smallest :" +a);
            }
            else if(b<a&&b<c)
            {
                System.out.println("Number b is the smallest:" +b);
            }
            else
            {
                System.out.println("Number c is the smallest :" +c);
            }
        }
}
