public class SecondMax2
{

    static int maxValue (int[] arr)
    {
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]> max)
            {
                max= arr[i];
                
            }
        }
        System.out.println("Max value is: "+max);
        return max;
    }

    static int SecondMaxValue(int[] arr)
    {
        int max= maxValue(arr);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                arr[i]= Integer.MIN_VALUE;
            }
        }

        int SecondMaxElement= maxValue(arr);

        return SecondMaxElement;
    }
    public static void main(String args[])
    {

        int array[]={1,2,3,4,5,6,7,8,9,10};

        System.out.println("Second max is: "+ SecondMaxValue(array));

    }
}