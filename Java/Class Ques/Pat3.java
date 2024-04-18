import java.util.Scanner;
class Pat3
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int num= s.nextInt();
        s.close();

        int i,j;

        for(i=1; i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i=1;i<=num;i++)
        {
            for(j=num;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}