// Find the total numbers of pairs in the array whose sum is equal to the given value of x
import java.util.Scanner;
public class TargetSum {

    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= s.nextInt();
        s.close();

        int[] arr= {4,2,1,5,4,3,7};
        int count= 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int sum;
                sum= arr[i]+arr[j];

                if(sum==num)
                {
                    count=count+1;
                    System.out.println(arr[i]+" "+arr[j]);
                }

            }
            
        }
        if(count==0)
        {
            System.out.println("No pairs found in the array.");
        }
    }
    
}
