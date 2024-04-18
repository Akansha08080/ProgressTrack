class LinearSearchStr
{
    public static void main(String args[])
    {
        String[] arr= {"akansha","jelly","jaggu","anshu"};
       String  item= "akansha";
      int  temp=0;

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i].equals(item))
            {
                System.out.println("It is at "+i+" Index");
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("Item not found");
        }
    }
}