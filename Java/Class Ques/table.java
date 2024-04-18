import java.util.Scanner;
class table
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the number of which you want to print the table: ");
        int num= s.nextInt();
        s.close();
        int i, result;

        for(i=1; i<=10; i++)
        {
            result= num*i;
            System.out.println(num+"*"+i+"="+result);
        }
        
    }
}
