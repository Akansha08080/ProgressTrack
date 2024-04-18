import java.util.Scanner;
class Pat7
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number");
        int num= s.nextInt();
        s.close();

        int i,j,k;

        for(i=1; i<=num;i++)
        {
            for(j=num;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}