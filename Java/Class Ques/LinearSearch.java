class LinearSearch
{
    public static void main(String args[])
    {
        int[] a= {2,8,9,1,6};
        int item=7;
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==item)
            {
                System.out.println("Item is at"+i+ "index");
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("Item not found");
        }

    }
}