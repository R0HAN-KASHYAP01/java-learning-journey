package Sorting.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array_Increasing_Frequency {
//    LeetCode: 1636. Sort Array by Increasing Frequency
    /*
    Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

Return the sorted array.



Example 1:
Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.

Example 2:
Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.

Example 3:
Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]


Constraints:
1 <= nums.length <= 100
-100 <= nums[i] <= 100
     */

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i<n; i++){
            num[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(frequencySort(num)));
    }
    static public int[] frequencySort(int[] nums) {
        int[] freq = new int[201];
        int n = nums.length;
        for(int num: nums){
            freq[num+100]++;

        }
        Integer[] arr = new Integer[n];
        for(int i = 0; i<n; i++){
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a,b)->{
            if(freq[a+100] == freq[b+100]){
                return b -a;
            }
            return freq[a+100] - freq[b+100];
        });
        for(int i = 0; i<n; i++){
            nums[i]= arr[i];
        }
        return nums;
    }
}
