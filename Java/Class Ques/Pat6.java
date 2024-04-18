import java.util.Scanner;
class Pat6
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num= s.nextInt();
        s.close();

        int i,j,k;

        for(i=1; i<=num+1;i++)
        {
            for(j=num;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=num;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}