/*
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

import java.util.Scanner;
class Que4
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number to print table: ");
        int num= s.nextInt();
        s.close();
        int i,table;

        for(i=1;i<=10;i++)
        {
            table= num*i;
            System.out.println(num+"*"+i+"="+table);

        }
        
    }

}
