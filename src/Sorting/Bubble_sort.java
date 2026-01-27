package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[size];
        for (int i =0; i<size; i++){
            arr[i] = input.nextInt();
        }

        Bubble_sort(arr);
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble_sort(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j= 0; j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
