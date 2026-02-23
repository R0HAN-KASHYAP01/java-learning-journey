package Sorting.Easy;

import java.util.Scanner;

public class Third_Maximum_Number {

//    LeetCode: 414. Third Maximum Number

    /*
    Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

        Example 1:
        Input: nums = [3,2,1]
        Output: 1
        Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2.
        The third distinct maximum is 1.

        Example 2:
        Input: nums = [1,2]
        Output: 2
        Explanation:
        The first distinct maximum is 2.
        The second distinct maximum is 1.
        The third distinct maximum does not exist, so the maximum (2) is returned instead.

        Example 3:
        Input: nums = [2,2,3,1]
        Output: 1
        Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2 (both 2's are counted together since they have the same value).
        The third distinct maximum is 1.


        Constraints:
        1 <= nums.length <= 104
        -231 <= nums[i] <= 231 - 1
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
        System.out.println("Third Maximum Number is : ");
        System.out.println(thirdMax(nums));
    }

    static public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(long num : nums){
            if(num > first){
                third = second;
                second = first;
                first = num;

            }
            else if(num > second && num != first){
                third = second;
                second = num;
            }
            else if(num > third && num < second){
                third = num;
            }
        }
        if(third == Long.MIN_VALUE){
            return (int)first;
        }
        return (int)third;

    }
}
