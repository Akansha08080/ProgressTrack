import java.util.*;
class ReturnIndex
{
    void indexReturn()
    {
        
        int[] arr={1,2,3,4,5,6,7,8};

        int ans=-1;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number to found");
        int num= s.nextInt();
        s.close();



        for(int i=0;i<arr.length; i++)
        {

            if(arr[i]==num)
            {
                ans= i;
                break;
            }
        }
        System.out.println("At index "+ans);


    }

    public static void main(String args[])
    {
        ReturnIndex obj= new ReturnIndex();
        

        obj.indexReturn();
        
    }
}