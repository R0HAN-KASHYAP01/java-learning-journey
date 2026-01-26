package Day7_BinarySearch_Question;

import java.util.Scanner;

public class Infinte_Array {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int size = input.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i<size; i++){
                arr[i] = input.nextInt();
            }
            System.out.println("Enter the target element: ");
            int target = input.nextInt();
            System.out.println(ans(arr, target));
        }
        static int ans(int[] arr, int target) {
            // first find the range
            // first start with a box of size 2
            int start = 0;
            int end = 1;

            // condition for the target to lie in the range
            while (target > arr[end]) {
                int temp = end + 1; // this is my new start
                // double the box value
                // end = previous end + sizeofbox*2
                end = end + (end - start + 1) * 2;
                start = temp;
            }
            return binarySearch(arr, target, start, end);

        }
        static int binarySearch(int[] arr, int target, int start, int end) {
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
            return -1;
        }
    }

