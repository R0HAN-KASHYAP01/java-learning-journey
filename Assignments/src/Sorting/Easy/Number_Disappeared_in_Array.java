package Sorting.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Number_Disappeared_in_Array {

//    LeetCode: 448. Find All Numbers Disappeared in an Array

    /*
    Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

        Example 1:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]

        Example 2:
        Input: nums = [1,1]
        Output: [2]

        Constraints:
        n == nums.length
        1 <= n <= 105
        1 <= nums[i] <= n

        Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
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
        System.out.println(findDisappearedNumbers(nums));
    }
    static public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int k = 0;
        while(k < nums.length){
            int correct_index = nums[k]-1;
            if(nums[k] == nums[correct_index]){
                k++;
            }
            else {
                int temp = nums[k];
                nums[k] = nums[correct_index];
                nums[correct_index] = temp;
            }
        }
        for(int i = 0; i< nums.length;i++){
            if(nums[i] != i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
