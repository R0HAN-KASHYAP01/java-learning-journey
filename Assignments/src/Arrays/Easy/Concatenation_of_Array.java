package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_of_Array {
//    Leet Code: 1929. Concatenation of Array
    /*
    Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.



Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
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
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    static public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[2*size];
        for(int i = 0; i<ans.length; i++){
            ans[i] = nums[i%size];
        }
        return ans;
    }
}
