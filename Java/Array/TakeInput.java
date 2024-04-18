import java.util.Scanner;
class TakeInput
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int num= s.nextInt();
        int [] arr= new int[num];
        
        
        System.out.println("Enter "+num+ " numbers");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]= s.nextInt();
        }

        for(int i=0; i<num; i++)
        {
            System.out.print ( " "+arr[i]);
        }
        s.close();

    }
}