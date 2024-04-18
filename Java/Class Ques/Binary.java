public class Binary {

    public static void main(String args[])
    {
        int[] a= {5,8,9,2,3,1};
        int item=1;
        int temp=0;

        for(int i=0;i<a.length;i++)
        {
            if( a[i]==item)
            {
 
                System.out.println("The item is at"+ i+ "index");
                temp=temp+1;
            }
          
        }

        if(temp==0)
        {
            System.out.println("Item not found");
        }
    }
    
}
