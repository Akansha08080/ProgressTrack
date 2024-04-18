import java.util.Scanner;
public class Concatination {
    
    public static int[] arrayConcat (int [] arr, int n)
    {
        int[] cnct= new int[ 2* n];
        
        for( int i=0;i<n;i++)
        {
            cnct[i]= arr[i];
            cnct[i+n]= arr[i];

        }
        return cnct;

    }

    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements of Array");
        int n= s.nextInt();
        int[] arr= new int[n];
        

        for(int i=0;i<n;i++)
        {
            System.out.println("enter an element to array");
            arr[i]= s.nextInt();
        }       
        
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]);
        // }

        System.out.println("Here is the concation of array: ");

       int[] ans= arrayConcat(arr, n);

       for(int i=0;i<ans.length;i++)
       {
        System.out.print(ans[i]);
       }


    }
}
