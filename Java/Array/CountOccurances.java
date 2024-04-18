import java.util.Scanner;
public class CountOccurances 
{
    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int num= sc.nextInt();
        

        int[] arr= new int[5];

        System.out.println("Enter 5  numbers: ");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                count=count+1;
            }

        }

        if(count==0)
        {
            System.out.println("Number not found in array!!");
        }
        else
        {
            System.out.print(" The number occured "+ count +" times");
        }

        sc.close();
    }
    
}
