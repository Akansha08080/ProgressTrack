import java.util.Scanner;

public class LastOccurance {

    // This method now returns the created and filled array
    static int[] ask() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int num = s.nextInt();
        int[] ar = new int[num];

        System.out.println("Enter " + num + " elements in the array:");
        for (int j = 0; j < ar.length; j++) {
            ar[j] = s.nextInt();
        }

        // Do not close the Scanner here to reuse it in main
        // s.close();

        return ar;
    }

    // Modified to directly take an array and a number to check as arguments
    void lastCheck(int[] arr, int x) {
        int lastPosition = -1; // Initialize to indicate not found
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == x) {
                lastPosition = j; // Update last position
            }
        }

        if (lastPosition != -1) {
            System.out.println(x + " last occurred at position " + lastPosition);
        } else {
            System.out.println(x + " not found in the array.");
        }
    }

    public static void main(String args[]) {
        int[] array = ask(); // Get the array from ask()

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int no = s.nextInt();

        LastOccurance obj = new LastOccurance();
        obj.lastCheck(array, no); // Pass the array and number to lastCheck

        s.close();
    }
}
