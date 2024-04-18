import java.util.Scanner;
import java.util.Arrays;
public class CheckSorted {
    
    void printsArr(int[] arr)
    {
       int[] array= arr.clone(); 
        Arrays.sort(array);
       
        int [] ans= {array[0],array[array.length-1]};
        System.out.println(Arrays.toString(ans));
      
    }
    public static void main(String args[])
    {
        int[] arr={ 1,9,10,4,5};
        CheckSorted obj= new CheckSorted();
        obj.printsArr(arr);
        boolean issorted= true;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {

                issorted= false;
                break;
            }
        }
        if(issorted== true)
        {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Not sorted array");
        }

        int choice=0;
       Scanner s=  new Scanner(System.in);
        System.out.println("Do you want to sort the array: \n press 1 to continue");
        choice= s.nextInt();
        s.close();
       


        switch(choice)
        {
            case 0:
            System.out.println("okay");
            break;

            case 1:

            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
            break;

        }



    }
}
