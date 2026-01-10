package Day4_Array_List;

import java.util.Arrays;
import java.util.Scanner;

public class array_1D  {
    static void main(String[] args) {
//        Initilize a 1D array
        int[] arr1 = new int[5];

//      Another Way
        int[] arr2;
        arr2 = new int[5];

//        Enter value in array with initilizing
        String[] arr12 = {"Uday", "Rohan","Dipesh"};

//        take value without input
        arr1[0] = 4;
        arr1[1] = 34;
        arr1[2] = 45;
        arr1[3] = 422;
        arr1[4] = 14;

//        Taking value by input from user
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }

//        Printing the value of Array
//        Method 1:
        System.out.println("Printing the arr2: ");
        for (int i= 0; i<arr2.length; i++){
            System.out.print(arr2[i]+ " ");
        }
        System.out.println();

//        Method 2:
        System.out.println("Printing the arr1: ");
        for(int num: arr1){
            System.out.print(num+ " ");
        }
        System.out.println();

//        Method 3:
        System.out.println(Arrays.toString(arr12));

//        Changing the value of array by indexing
        arr1[3] = 34;
        System.out.println(Arrays.toString(arr1));

    }
}
