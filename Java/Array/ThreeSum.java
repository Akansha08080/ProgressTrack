// Find the total numbers of triplets in the array whose sum is equal to the given value of x
import java.util.Scanner;
public class ThreeSum {
    
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= s.nextInt();
        s.close();

        int count=0;
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]== num)
                    {
                        count=count+1;
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);

                    }
                }
            }

        }

        if(count!=0)
        {
            System.out.print("The number of pairs are:  "+ count);
        }
        else{

            System.out.println("not found");
        }
        
         
        
    }
}
