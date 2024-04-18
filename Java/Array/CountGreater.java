import java.util.Scanner;
public class CountGreater {

    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num= s.nextInt();

        int count=0;
        int[] arr= {4,5,6,3,8};

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>num)
            {
                count=count+1;
            }
        }
if(count>0)
{
    System.out.println("The number is smaller than "+count+" elements");
}
s.close();
    }
    
}
