// public class Max 
// {
//     public static void main(String args[])
//     {
//         int[] arr= {2,4,3,10,11,4,12};
//         int max=arr[0];

//         for(int i=0;i<arr.length;i++)
//         {
//             if(max<arr[i])
//             {
//                 max=arr[i];
//             }
//         }
//         System.out.println("Max element in array is: "+ max);

//     }
    
// }

public class Max
{
    void maxArr()
    {
        int [] arr={3,7,9,2,1,10,8};
        int max= arr[0];

        for(int i=0;i<arr.length; i++)
        {
            if(max<arr[i])
            {
                max= arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String args[])
{
    Max obj= new Max();
    obj.maxArr();
}


}



