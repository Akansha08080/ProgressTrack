import java.util.Scanner;
class Calculator
{
public static void main(String args[])
{
      
    Scanner s= new Scanner(System.in);
    String yn;
    do{
      
        System.out.println("Enter first number: ");
        int first= s.nextInt();

        System.out.println("Enter second number: ");
        int second= s.nextInt();

        System.out.println("Enter symbol(+,-,*,/)");
        String symbol= s.next();
         int result;

         switch(symbol)
         {
          case "+":
          result= first+second;
          System.out.println("Addition is: "+result);
          break;

          case "-":
          result= first-second;
          System.out.println("Subtraction is: "+result);
          break;

          case "/":
          result= first/second;
          System.out.println("Division is: "+result);
          break;

          case "*":
          result= first * second;
          System.out.println("Multiplication is: "+result);
          break;

          default:

          System.out.println("Invalid symbol");
          break;
         }

                yn= s.next();
        
        } while (yn.equals("Y") || yn.equals("y")); // also use while (yn.equalsIgnoreCase("Y"));
        s.close();
    
}
}