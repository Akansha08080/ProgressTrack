import java.util.Scanner;
class Factorial
{

    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number for factorial: ");
        int num= s.nextInt();
        s.close();
        int fact=1;

        for( int i=1; i<=num;i++)
        {
            fact=fact*i;
            
        }
        System.out.println("Factorial of number is"+fact);
    }
}