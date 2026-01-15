package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Number_of_GoodPairs {
//    Leet Code: 1512. Number of Good Pairs

    /*
    Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.



Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
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
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }

    static public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
