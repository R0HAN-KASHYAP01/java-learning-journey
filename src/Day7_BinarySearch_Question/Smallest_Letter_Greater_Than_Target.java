package Day7_BinarySearch_Question;

import java.util.Scanner;

public class Smallest_Letter_Greater_Than_Target {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        char[] arr = new char[size];
        for (int i = 0; i<size; i++){
            arr[i] = input.next().charAt(0);
        }
        System.out.println("Enter the target element: ");
        char target = input.next().charAt(0);
        char ans = nextGreatesLetter(arr,target);
        System.out.println("Smallest Letter Greater than the target element is : ");
        System.out.println(ans);

    }
    static public char nextGreatesLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return arr[start % arr.length];
    }
}
