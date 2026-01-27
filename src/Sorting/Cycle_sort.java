package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Cycle_sort {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[size];
        for (int i =0; i<size; i++){
            arr[i] = input.nextInt();
        }

        cycle_sort(arr);
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arr));
    }
    static void cycle_sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
}
