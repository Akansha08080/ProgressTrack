import java.util.Scanner;
public class CopyArr {

    static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {

            
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int num= s.nextInt();
        int[] arr= new int[num];

        System.out.println("Enter" + num+ " elements for array");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]= s.nextInt();

        }

        for(int i=0;i<num; i++)
        {
            System.out.print(arr[i]);
        }

   
        printArr(arr2);

        
        
    }


    
}
