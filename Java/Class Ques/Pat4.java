import java.util.Scanner;
class Pat4
{
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row= s.nextInt();
        s.close();

        int i,j,k;

        for(i=1; i<=row; i++)
        {
            for(j=row; j>=i;j--)
            {
                System.out.print("  ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}