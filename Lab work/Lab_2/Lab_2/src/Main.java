
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Insertion in array

        // Original array containing 6 numbers
        int arr[] = {20, 90, 80, 70, 29, 30};

        int number, position;

        // New array with space for one extra number
        int arr2[] = new int[7];

        Scanner sc = new Scanner(System.in);

        // Display the original array
        System.out.println("Original Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Get the number to insert
        System.out.println("Enter a number to put in the array:");
        number = sc.nextInt();

        // Get the position (1-7)
        System.out.println("Enter the position (1-7):");
        position = sc.nextInt();

        // Check whether the position is valid
        if (position < 1 || position > arr.length + 1) {
            System.out.println("Invalid position!");
        } else {

            // Copy elements before the insertion position
            for (int i = 0; i < position - 1; i++) {
                arr2[i] = arr[i];
            }

            // Insert the new number
            arr2[position - 1] = number;

            // Shift the remaining elements to the right
            for (int i = position - 1; i < arr.length; i++) {
                arr2[i + 1] = arr[i];
            }

            // Display the updated array
            System.out.println("Array after Insertion:");

            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i]);
            }
        }
        sc.close();
    }
}
