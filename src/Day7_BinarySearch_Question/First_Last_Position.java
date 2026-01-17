package Day7_BinarySearch_Question;

import java.util.Arrays;
import java.util.Scanner;

public class First_Last_Position {
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
        System.out.println("Enter the size of array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = input.nextInt();
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int low = 0;
        int high = nums.length-1;
        int s = -1;
        int e = -1;
        int i = 0;
        if(high < 0){
            return ans;
        }
        if(nums[low] == target && low == high){
            ans[0] = 0;
            ans[1] = 0;
            return ans;
        }

        while(low <= high){
            if(nums[low] != target ){
                low++;
            }
            if(nums[high] != target){
                high--;
            }
        }
        ans[0] = low;
        ans[1] = high;
        return ans;
    }
}
