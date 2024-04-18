/*Write a Java program to print a face.
Expected Output

 +"""""+                                                 
[| o o |]                                                
 |  ^  |                                                 
 | '-' |                                                 
 +-----+ */

 class Que6{

    public static void main(String args[])
    {
        String[] arr= new String[5];

        arr[0]=" +\"\"\"\"\"+";
        arr[1]="[| o o |]";
        arr[2]=" |  ^  |";
        arr[3]=" | '-' |";
        arr[4]=" +-----+";
    
        for(int patt=0;patt<=4;patt++)
        {

        for(int i=0;i<=4;i++)
        {
            System.out.println(arr[i]);
        }
        
    }}
 }