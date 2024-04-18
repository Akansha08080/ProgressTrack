import java.util.Scanner;

class GetInput {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = s.next();
        
        System.out.println("Enter your gender: ");
        char gender = s.next().charAt(0);
        
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        
        System.out.println("Enter your phone number: ");
        long phno = s.nextLong();
        
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phno);
        s.close();
    }
}
