class AnimalObj2

{
    String colour;
    int age;
    void objinit(String c, int a)
    {
        colour=c;
        age=a;
    }
    void display()
    {
        System.out.println("colour is "+colour+" and age is "+age);
    }
    public static void main(String[] args) {
        
        AnimalObj2 buzo= new AnimalObj2();

        buzo.objinit("black", 10);
        buzo.display();
    }
}