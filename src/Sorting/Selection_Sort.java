package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[size];
        for (int i =0; i<size; i++){
            arr[i] = input.nextInt();
        }

        selection_sort(arr);
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arr));
    }
    static void selection_sort(int[] arr){
        for (int i = 0; i<arr.length; i++){
            int minInd= i;
            for (int j = i; j<arr.length; j++){
                if(arr[j] < arr[minInd]){
                    minInd = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    }
}
