package Arrays.Easy;

import java.util.Scanner;

public class Maximum_SubArray {
//    LeetCode : 53. Maximum Subarray

    /*
    Given an integer array nums, find the subarray with the largest sum, and return its sum.


Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
     */
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<size; i++){
            nums[i] = in.nextInt();
        }
        System.out.println("Maximum SubArray sum is : "+ maxSubArray(nums));
    }
    static public int maxSubArray(int[] nums) {
        int curr_sum = nums[0];
        int max_sum = nums[0];
        for(int i = 1; i<nums.length; i++){
            curr_sum = Math.max(nums[i],curr_sum + nums[i]);
            max_sum = Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }
}


/*
Logic : Here we have to calculate each SubArray and then find the maximum number
So, We use Kadane's Algorithm
In which, we compare current_element with the current_element + previous_sum and assign the maximum in the current_sum
then, compare current_sum and max_sum and store maximum in the max_sum
at the end we get the maximum sum SubArray.
 */