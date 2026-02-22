package Sorting.Easy;

import java.util.HashSet;
import java.util.Scanner;

public class Contains_Duplicate {

//    LeetCode: 217. Contains Duplicate

    /*

    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

            Example 1:
            Input: nums = [1,2,3,1]
            Output: true
            Explanation:
            The element 1 occurs at the indices 0 and 3.

            Example 2:
            Input: nums = [1,2,3,4]
            Output: false
            Explanation:
            All elements are distinct.

            Example 3:
            Input: nums = [1,1,1,3,3,4,3,2,4,2]
            Output: true

            Constraints:
            1 <= nums.length <= 105
            -109 <= nums[i] <= 109
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
        System.out.println(containsDuplicate(nums));
    }
    static public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
