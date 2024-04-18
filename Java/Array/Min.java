public class Min {

    public static void main(String args[])
    {
        int[] arr= {9,2,3,10,3,12};
        int min=arr[0];

        for( int i=1; i<arr.length; i++)
        {
            if(min>arr[i])
            {
                min= arr[i];
            }
            

        }
        System.out.println(min);
    }
    
}
