import java.util.Scanner;
class Pat7_secondMethod {
   public static void main(String[] args) {
    
    Scanner s= new Scanner(System.in);
    System.out.println("Enter number");
    int num= s.nextInt();
    s.close();

    int i,j;
    for(i=1;i<=num;i++)
    {
        for(j=num;j>=1;j--)
        {
            if(j>i)
            {
                System.out.print(" ");
            }
            else{

                System.out.print(" *");
            }
         
        }
    System.out.println();
    }
   } 
}
