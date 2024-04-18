import java.util.Scanner;
class Armstrong
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= s.nextInt();
        s.close();

        int t1= num;
        int lngth=0;

        while(t1 !=0)
        {
            lngth= lngth+1;
            t1=t1/10;
        }

        int arm=0, rem,i;
        int t2=num;

        while(t2!=0)
        {
            int mul=1;

            rem= t2 % 10;

        for(i=1; i<=lngth; i++)
        {
         mul=mul*rem;
        }
        arm=arm+mul;
        t2=t2/10;
    }

    if(arm==num)
    {
        System.out.println("Number is armstrong");
    }
    else{

        System.out.println("Number is not armstrong");
    }
    }
}