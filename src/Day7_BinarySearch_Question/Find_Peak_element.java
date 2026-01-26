package Day7_BinarySearch_Question;

import java.util.Scanner;

public class Find_Peak_element {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Peak element of the array is: ");
        System.out.println(peakElement(arr));

    }
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end -start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return arr[start];
    }
}
