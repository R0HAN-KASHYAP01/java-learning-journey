package Day7_BinarySearch_Question;

import Day6_BinarySearch.BinarySearch;

import java.util.Scanner;

public class Search_Mountain_Array {
    static void main(String[] args) {

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
        System.out.println(findMountainArray(arr,target));
    }

    static int findMountainArray(int[] arr, int target){
        int start = 0;
        int end = peakElement(arr);
        int index = binarySearch(arr,target,start,end);
        if(index != -1){
            return index;
        }
        return binarySearch(arr,target,end+1,arr.length-1);
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
        return start;
    }
    static int binarySearch(int[] arr,int target, int start ,int end){

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if (arr[mid] > target){
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }
            }
            else{
                if(arr[mid] > target){
                    start = mid+1;
                }
                else{
                    end = mid -1;
                }
            }
        }
        return -1;

    }
}
