class Animal
{

    public void eat()
        {
            System.out.println("Hey i am eating");
        }
    public void run()
    {
        System.out.println("I am running");
    }
    
    public static void main(String args[])
    {
        System.out.println("heyy");
        Animal buzo=new Animal();
        
        buzo.eat();
        buzo.run();

        Birds sp= new Birds();
        sp.fly();
    
        
    }

}
class Birds
{
    public void fly()
    {
        System.out.println("I can fly, Yeah!!");
    }
}