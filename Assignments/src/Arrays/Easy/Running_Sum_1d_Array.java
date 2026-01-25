package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Running_Sum_1d_Array {
//    Leet Code: 1480. Running Sum of 1d Array

    /*
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.



Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
     */

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i< size; i++){
            nums[i] = input.nextInt();
        }
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
    static public int[] runningSum(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        int prevSum = 0;
        for(int i = 0; i < size; i++){
            prevSum += nums[i];
            ans[i] = prevSum;
        }
        return ans;
    }
}
