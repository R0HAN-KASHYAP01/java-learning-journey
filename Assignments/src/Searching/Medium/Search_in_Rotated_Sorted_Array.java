package Searching.Medium;

import java.util.Scanner;

public class Search_in_Rotated_Sorted_Array {
//    LeetCode: 33. Search in Rotated Sorted Array

    /*
    There is an integer array nums sorted in ascending order (with distinct values).

        Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

        Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

        You must write an algorithm with O(log n) runtime complexity.

        Example 1:
        Input: nums = [4,5,6,7,0,1,2], target = 0
        Output: 4

        Example 2:
        Input: nums = [4,5,6,7,0,1,2], target = 3
        Output: -1

        Example 3:
        Input: nums = [1], target = 0
        Output: -1
     */
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
