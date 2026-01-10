package Day4_Array_List;

import java.util.Arrays;
import java.util.Scanner;

public class array_2D {
    static void main(String[] args) {
//      Initilizing the 2D array

//        Method 1: Giving the size of both row and column
        int[][] arr1 = new int[3][3];

//        Method 2: Giving only the size of row becuase column size is not nesscary
        int[][] arr2 = new int[3][];

//      Giving value to the array

//        Method 1: Giving value while initilizing the array
//                -> 2D array of same size of row and column

        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//                -> 2D array of different size of row and column
        int[][] mat2 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

//        Method 2: Taking input from the user
//                 -> Same size of row and column are same
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of 3X3 matrix: ");
        for (int row = 0; row < arr1.length; row++) {
            for (int column = 0; column < arr1[row].length; column++) {
                arr1[row][column] = input.nextInt();
            }
        }
/*
//                 -> Different size of row and column are same
        System.out.println("Enter the elements of 3Xn Matrix: ");
        for (int row = 0; row < arr2.length; row++) {
            for (int column = 0; column < arr2[row].length; column++) {
                arr2[row][column] = input.nextInt();
            }
        }

 */


//    Printing the Elements of Array

//  Method 1: Using Index
        System.out.println("Printing the value using Index: ");
    for (int row = 0; row < arr1.length; row++){
        for(int column = 0; column < arr1[row].length; column++){
            System.out.print(arr1[row][column]+ " ");
        }
        System.out.println();
    }

//    Method 2: Using element
        System.out.println("Printing the value using element: ");
        for (int[] row : mat1){
            for(int num : row){
                System.out.print(num+ " ");
            }
            System.out.println();
        }

//        Method 3: Using Function
        System.out.println("Printing the value using Function: ");
        for (int[] row : mat2){
            System.out.println(Arrays.toString(row));

        }




    }


}
