import java.util.*;
class oop
{
    
	int roll;
	String name;
	double marks;
	
	public void setData(int r , String n , double m)
	{
		roll = r;
		name = n;
		marks = m;
	} 
	
	public void getData()
	{
		System.out.println(roll);
		System.out.println(name);
		System.out.println(marks);
	}
		
}

class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);		

		oop obj = new oop();
		obj.setData(21,"Naman",99.92);
		obj.getData();
	
		oop obj2 = new oop();
		int roll2;
		String name2;
		double marks2;
		System.out.print("Enter roll no : ");
		roll2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name : ");
		name2 = sc.nextLine();
		System.out.print("Enter marks : ");
		marks2 = sc.nextDouble();
		obj2.setData(roll2,name2,marks2);
		obj2.getData();
		
	}
}