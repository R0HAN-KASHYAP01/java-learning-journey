package Sorting.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class _3_SUM_Closet {
//    LeetCode: 16. 3Sum Closest

    /*
    Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.



Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Example 2:
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).


Constraints:
3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
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
        System.out.println("Enter the target: ");
        int target = input.nextInt();
        System.out.println("Number closet to target is : "+threeSumClosest(num,target));
    }
    static public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2];
        for(int i = 0; i<n-2; i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(Math.abs(target - sum) < Math.abs(target - ans)){
                    ans = sum;
                }
                if(sum == target){
                    return sum;
                }
                else if(sum > target) r--;
                else l++;

            }
        }
        return ans;
    }
}
