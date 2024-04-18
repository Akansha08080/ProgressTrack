import java.util.Scanner;
class prime
{
    public static void main (String args[])
{
  Scanner a= new Scanner(System.in);
  System.out.println("enter the number: ");
  int num= a.nextInt();
  a.close();
  int i, count=0;

  for(i=2;i<=num-1;i++)
  {

    if(num%i==0)
    {
        count=count+1;
      
    }
  }
  if(count>1)
  {
    System.out.println("Its not a prime number");
  }
  else
  {
    System.out.println("Its a prime number");
  }

  
  
}
}