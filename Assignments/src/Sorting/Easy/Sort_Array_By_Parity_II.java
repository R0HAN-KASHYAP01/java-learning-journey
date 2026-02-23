package Sorting.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array_By_Parity_II {

//    LeetCode: 922. Sort Array By Parity II

    /*
    Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

        Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

        Return any answer array that satisfies this condition.

        Example 1:
        Input: nums = [4,2,5,7]
        Output: [4,5,2,7]
        Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

        Example 2:
        Input: nums = [2,3]
        Output: [2,3]


        Constraints:
        2 <= nums.length <= 2 * 104
        nums.length is even.
        Half of the integers in nums are even.
        0 <= nums[i] <= 1000
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
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    static public int[] sortArrayByParityII(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        int even = 0;
        int odd = 1;
        for(int i = 0; i<size; i++){
            if(nums[i] % 2 == 0){
                ans[even] = nums[i];
                even += 2;
            }
            else{
                ans[odd] = nums[i];
                odd += 2;
            }
        }
        return ans;
    }
}
