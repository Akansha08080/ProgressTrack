class CheckLeapYear
{
    public static void main( String args[])
    {
        int year= 2002;

        if((year %400==0) || (year%4==0) && (year%100!=0))
        {
            System.out.println("This is a leap year");
        }
        else
        {
            System.out.println("This is not a leap year");
        }
    }
}