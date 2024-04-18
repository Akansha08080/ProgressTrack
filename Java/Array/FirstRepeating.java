// Given a array "a" consisting of integer. return first value that is repeating in the array. if no value is repeating then return -1.

public class FirstRepeating
{


    static int Repeating(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                   return arr[i];
                }
                
            }
        }
         return -1;
    }
    public static void main(String args[])
    {

        int[] a= {1,2,3,2,3,4,5,6,7,8,9,10};
    
     System.out.println(Repeating(a));   
       
        
    }
}