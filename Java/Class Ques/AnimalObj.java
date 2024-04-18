// To initialise objects(Put value in objects)- using reference variable

public class AnimalObj
{
    String colour;
    int age;
    public static void main(String args[])
    {
        AnimalObj buzo= new AnimalObj();
        buzo.colour="black";
        buzo.age= 10;
        System.out.println("Colour of buzo is "+buzo.colour+" And age of buzo is "+buzo.age);
    }
}