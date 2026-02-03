package Searching.Medium;

import java.util.Scanner;

public class Search_in_Rotated_Sorted_Array {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] nums = new int[size];
        for (int i = 0; i<size; i++){
            nums[i] = input.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = input.nextInt();
        System.out.println("Index of the Target in the array is: ");
        System.out.println(search(nums,target));
    }
    static public int search(int[] nums, int target) {
        int peek = peakIndexInMountainArray(nums);
        int ans = binarySearch(nums,target,0,peek);
        if(ans != -1){
            return ans;
        }
        return binarySearch(nums,target,peek+1,nums.length-1);

    }
    static public int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;

    }

    static public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {

                end = mid;
            }
            else if(arr[start] > arr[mid]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
