/* Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125 */

import java.util.Scanner;
class Que3
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter first number:  ");
        int num1= s.nextInt();
        System.out.println("enter second number: ");
        int num2= s.nextInt();
        s.close();
         int product= num1*num2;

        System.out.println(num1+"*"+ num2 +"="+product);
    }
}