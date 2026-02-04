package Searching.Easy;

import java.util.Scanner;

public class Special_Array_X_element_Greater_Equal_X {
//    1608. Special Array With X Elements Greater Than or Equal X

    /*
    You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.

        Notice that x does not have to be an element in nums.

        Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.

        Example 1:
        Input: nums = [3,5]
        Output: 2
        Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.

        Example 2:
        Input: nums = [0,0]
        Output: -1
        Explanation: No numbers fit the criteria for x.
        If x = 0, there should be 0 numbers >= x, but there are 2.
        If x = 1, there should be 1 number >= x, but there are 0.
        If x = 2, there should be 2 numbers >= x, but there are 0.
        x cannot be greater since there are only 2 numbers in nums.

        Example 3:
        Input: nums = [0,4,3,0,4]
        Output: 3
        Explanation: There are 3 values that are greater than or equal to 3.
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
        System.out.println(specialArray(nums));
    }
    static public int specialArray(int[] nums) {
        int N = nums.length;
        int[] freq = new int[N + 1];

        for (int i = 0; i < N; i++) {
            freq[Math.min(N, nums[i])]++;
        }

        int numGreaterThanOrEqual = 0;
        for (int i = N; i >= 1; i--) {
            numGreaterThanOrEqual += freq[i];
            if (i == numGreaterThanOrEqual) {
                return i;
            }
        }

        return -1;
    }
}
