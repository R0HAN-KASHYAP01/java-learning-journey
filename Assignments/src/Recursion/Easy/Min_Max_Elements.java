package Recursion.Easy;

import java.util.Arrays;

public class Min_Max_Elements {

//    GFG:
    /*
    Given an array of integers arr[], find the minimum and maximum elements in the array using recursion only. The first element of the output represents the minimum value, and the second element represents the maximum value in the array.

Examples:

Input: arr[] = [1, 4, 3, -5, -4, 8, 6]
Output: [-5, 8]
Explanation: -5 is the minimum and 8 is the maximum element in the array

Input: arr[] = [12, 3, 15, 7, 9]
Output: [3, 15]
Explanation: 3 is the minimum and 15 is the maximum element in the array
     */

    static void main(String[] args) {
        int[] arr = {1,4,3,-5,-4,8,6};
        System.out.println(Arrays.toString(minMax(arr)));
    }
    static int[] minMax(int[] arr) {
        return helper(arr, 0, arr[0], arr[0]);
    }

    static int[] helper(int[] arr, int i, int min, int max) {
        if (i == arr.length)
            return new int[]{min, max};

        min = Math.min(min, arr[i]);
        max = Math.max(max, arr[i]);

        return helper(arr, i + 1, min, max);
    }
}
