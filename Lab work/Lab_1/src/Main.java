import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // One Dimemsional Array

        /*Example 1.1: Write a program assign 5 value in one dimensional array and display all values using loops.

        // Intialize and decleare
        int arr[] = {2, 4, 6, 8, 10};

        //Display using loop
        for(int i = 0; i< arr.length; i++){
            System.out.println("Value at " + i + " index is " + arr[i]);
        }

        // Two Dimensional Array :
        Example 1.2: Write a program inputs values from user in two-dimensional array and then displays its values

        // For input
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        // Taking Input
        System.out.println("Enter 3x3 Matric : ");

        // Nested Loop
        for(int rows = 0; rows < 3; rows ++){
            for(int col = 0; col < 3; col ++){
                arr[rows][col] = sc.nextInt();
            }
        }

        // Printing 2D array

        for(int rows = 0; rows < 3; rows++){
            for(int col = 0; col < 3; col++){
                System.out.print(arr[rows][col] + "\t");
            }
            System.out.println();
        }

        // Three Dimensional Array :

        Example 1.3 :Write a program that inputs values from user and store them in two 3D arrays. Calculate
        and display sum using loops.*/

        Scanner sc = new Scanner(System.in);

        int[][][] arr = new int[2][2][3];

        // Taking input from the user
        System.out.println("Enter 12 numbers:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("Enter value [" + i + "][" + j + "][" + k + "]: ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Printing the 3D array
        System.out.println("\nElements of the 3D Array:");

        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1) + ":");

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }

            System.out.println();
        }

        sc.close();
        }
    }
