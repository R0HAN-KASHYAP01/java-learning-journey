package Day7_BinarySearch_Question;

import java.util.Scanner;

public class Floor_Number {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target Number: ");
        int target = input.nextInt();
        System.out.println("Celing Number is: "+ floor(arr,target));
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return end;
    }
}
