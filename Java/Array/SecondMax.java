import java.util.Arrays;
public class SecondMax {
    public static void main(String args[])
    {
        int arr[]={ 7,5,4,8,20,10};
        Arrays.sort(arr);
        System.out.println("Second max: "+ arr[arr.length-2]);
        

    }
}
