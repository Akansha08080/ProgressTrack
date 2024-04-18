class GreaterThreeNested
{
    public static void main(String args[])
    {
        int a=100, b=500 , c= 2500;

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is greater");
            }
            else
            {
                System.out.println("C is greater");

            }
        }  
        else if (b>c)
        
          {
            System.out.println("B is greater");
           }
        
       
        else
        {
            System.out.println("C is greater");
                
        }
        
    }
}