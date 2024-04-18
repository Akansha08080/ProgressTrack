import java.util.Scanner;
class PrintPrime
{
    public static void main(String args[])
    {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= a.nextInt();
        a.close();
        int i,j, temp=0;

        for(i=1;i<=num;i++)
        {
            for(j=2;j<=i-1;j++)
            {
              if(i%j==0)


              {
                temp=temp+1;
              }
              
            }
            if(temp==0)
            {
                System.out.println(i);
            }
            else{
                temp=0;
            }
        }
    }
}
