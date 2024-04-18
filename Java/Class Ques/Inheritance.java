class Parent
{
    public void m1()
    {
        System.out.println("Parent method");
    }
    class Child extends Parent
    {
        public void m2()
        {
            System.out.println("Child method");
        }

    }

    class Inheritance
    {
        public static void main(String args[])
        {
            Parent p= new Parent();
            p.m1();
            // p.m2(); can't be called because m2 is not method of class parent

            Child c= new Child();
            c.m1();
            c.m2();



            // Parent p1= new child();
            // p1.m1();
            // p1.m2(); This is also wrong

            // Child c1= new Parent();  This is wrong 
            // c1.m1();
            // c1.m2();

        }
    }
}