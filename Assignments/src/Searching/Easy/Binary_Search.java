package Searching.Easy;

import java.util.Scanner;

public class Binary_Search {
//    LeetCode: 704. Binary Search

    /*
    Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

        You must write an algorithm with O(log n) runtime complexity.



        Example 1:

        Input: nums = [-1,0,3,5,9,12], target = 9
        Output: 4
        Explanation: 9 exists in nums and its index is 4
        Example 2:

        Input: nums = [-1,0,3,5,9,12], target = 2
        Output: -1
        Explanation: 2 does not exist in nums so return -1
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the value of Target: ");
        int target = input.nextInt();
        System.out.println(search(arr,target));

    }
    static public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid-1;
            }
            else if (nums[mid] < target){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
