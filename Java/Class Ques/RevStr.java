import java.util.Scanner;
class RevStr
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
        String word= s.next();

        s.close();

        int len,i;
        String rev="  ";

        len= word.length();

        for(i=len-1;i>=0; i--)
        {
           rev=rev+ word.charAt(i);
        }
        System.out.println("reverse is :"+rev);



    }

}