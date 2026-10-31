
public class Main {

    // Find the smallest and largest values
    static int[] TwoExtreamValue(int A[]) {

        int smallest = A[0];
        int largest = A[0];

        // Check every element in the array
        for (int i = 1; i < A.length; i++) {

            if (A[i] < smallest) {
                smallest = A[i];
            }

            if (A[i] > largest) {
                largest = A[i];
            }
        }

        // Return smallest and largest values
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {

        int A[] = {20, 5, 80, 10, 90, 30};

        // Call the method
        int result[] = TwoExtreamValue(A);

        System.out.println("Smallest value: " + result[0]);
        System.out.println("Largest value: " + result[1]);
    }
}
