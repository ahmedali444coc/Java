
class MyArrayList {

    private int arr[];
    private int size;

    // Create an empty list with capacity 5
    MyArrayList() {
        arr = new int[5];
        size = 0;
    }

    // Add a new element to the end
    void add(int value) {

        // Increase capacity if the array is full
        if (size == arr.length) {
            int temp[] = new int[arr.length * 2];

            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }

            arr = temp;
        }

        arr[size] = value;
        size++;
    }

    // Remove an element using its index
    void remove(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        // Shift elements left
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    // Return an element at the given index
    int get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }

        return arr[index];
    }

    // Check whether a value exists
    boolean contain(int value) {

        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }

    // Check whether the list is empty
    boolean is_empty() {
        return size == 0;
    }

    // Return the index of a value, or -1 if not found
    int IndexOff(int value) {

        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }

    // Return a new array containing only list elements
    int[] ToArray() {

        int result[] = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    // Reduce capacity to match the current number of elements
    void TrimToSize() {

        int temp[] = new int[size];

        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }

    // Return the number of elements
    int size() {
        return size;
    }
}

public class ArratList {

    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Display an element
        System.out.println("Element at index 1: " + list.get(1));

        // Check whether a value exists
        System.out.println("Contains 30: " + list.contain(30));

        // Find the index of a value
        System.out.println("Index of 40: " + list.IndexOff(40));

        // Remove the element at index 1
        list.remove(1);

        // Convert the list into an array
        int result[] = list.ToArray();

        System.out.println("List after removal:");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        // Check whether the list is empty
        System.out.println("Is empty: " + list.is_empty());

        // Reduce the internal array capacity
        list.TrimToSize();

        System.out.println("Current size: " + list.size());
    }
}
