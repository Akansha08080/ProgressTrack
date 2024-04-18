class BinarySearch
{
    public static void main(String args[])
    {
        int [] arr= {1,2,3,4,4,4,5,6,7,8,9,10};
        int item=7;
        int li=0;
        int hi= arr.length-1;
        int mi= (li+hi)/2;
        int ans=-1;

        while(li<=hi)
        {
            if(item== arr[mi])
            {
                ans= mi;
                hi= mi-1;
            }
            else if(item<arr[mi])
            {
                hi=mi-1;
            }
            else
            {
                li=mi+1;
            }
            mi=(li+hi)/2;
        
    }
    if(li>hi)
    {
        System.out.println("Item not found");
    }
}
}