package Sorting.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Squares_of_Sorted_Array {
//    LeetCode: 977. Squares of a Sorted Array

    /*
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

        Example 1:
        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
        Explanation: After squaring, the array becomes [16,1,0,9,100].
        After sorting, it becomes [0,1,9,16,100].

        Example 2:
        Input: nums = [-7,-3,2,3,11]
        Output: [4,9,9,49,121]

        Constraints:
        1 <= nums.length <= 104
        -104 <= nums[i] <= 104
        nums is sorted in non-decreasing order.

        Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<size; i++){
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    static public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;
        int j = n-1;
        int k = j;
        while(i <= j){
            if(Math.abs(nums[i]) < Math.abs(nums[j])){
                ans[k] = nums[j]*nums[j];
                k--;
                j--;
            }
            else{
                ans[k] =  nums[i] * nums[i];
                k--;
                i++;
            }
        }
        return ans;
    }
}
