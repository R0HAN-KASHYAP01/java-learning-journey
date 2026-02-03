package Searching.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class First_Last_Position_Sorted_array {
//    LeetCode: 34. Find First and Last Position of Element in Sorted Array

    /*
    Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

        If target is not found in the array, return [-1, -1].

        You must write an algorithm with O(log n) runtime complexity.

        Example 1:
        Input: nums = [5,7,7,8,8,10], target = 8
        Output: [3,4]

        Example 2:
        Input: nums = [5,7,7,8,8,10], target = 6
        Output: [-1,-1]

        Example 3:
        Input: nums = [], target = 0
        Output: [-1,-1]

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
        System.out.println("First and Last Position of the target is: ");
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    static public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = index(nums,target,true);
        if(ans[0] != -1){
            ans[1] = index(nums,target,false);
        }
        return ans;

    }
    static public int index(int[] nums,int target,boolean firstIndex){
        int start = 0;
        int ans = -1;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid -1;

            }
            else if (nums[mid] < target){
                start = mid+1;
            }
            else{
                ans = mid;
                if(firstIndex){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }

        }
        return ans;
    }
}
