import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner s  = new Scanner( System.in);
        System.out.println("Enter number:");
        int num= s.nextInt();
        s.close();

        int  rem, rev=0, temp;
        temp= num;
 
        while(temp!=0)
        {
            rem= temp%10;
            rev= rev*10+rem;
            temp=temp/10;
        }

        if(num==rev)
        {
            System.out.println("Number is palindrome");
        }
        else{

            System.out.println("Number is not palindrome");
        }
    }
}