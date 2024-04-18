import java.util.Scanner;
public class FindNumber {
    public static void main(String args[])
    {
        Scanner s= new Scanner (System.in);
       
        System.out.println("Enter value of Q");
        int Q= s.nextInt();
        s.close();

        int[] a={ 2,3,4,5,6};

        for(int i=1; i<=Q;i++)
        {
            System.out.println("Enter number: ");
            int num= s.nextInt();
    
            for(int j=0; j<a.length;j++)
            {
                if(a[i]==num)
                {
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}
