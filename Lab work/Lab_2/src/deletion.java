public class deletion {
    public static void main(){

        // Original array containing 5 numbers
        int arr[] = {1, 2, 3, 4, 5};

        // Position of the element to delete (1-based position)
        int pos = 3;

        // Display the original array
        System.out.println("Original Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Check whether the position is valid
        if (pos < 1 || pos > arr.length) {
            System.out.println("Invalid position!");
        } else {

            // Shift elements left to remove the selected element
            while (pos < arr.length) {
                arr[pos - 1] = arr[pos];
                pos = pos + 1;
            }

            // Create a smaller array after deletion
            int arr2[] = new int[arr.length - 1];

            // Copy the remaining elements into the new array
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = arr[i];
            }

            // Display the array after deletion
            System.out.println("Array after deletion:");

            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i]);
            }
        }
    }
}
