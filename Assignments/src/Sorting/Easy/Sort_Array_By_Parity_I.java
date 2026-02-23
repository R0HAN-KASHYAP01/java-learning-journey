package Sorting.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array_By_Parity_I {

//    LeetCode : 905. Sort Array By Parity

    /*
    Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

        Return any array that satisfies this condition.

        Example 1:
        Input: nums = [3,1,2,4]
        Output: [2,4,3,1]
        Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

        Example 2:
        Input: nums = [0]
        Output: [0]


        Constraints:
        1 <= nums.length <= 5000
        0 <= nums[i] <= 5000
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
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    static public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i <j){
            if(nums[i] % 2!= 0 && nums[j] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            else if(nums[i] % 2 != 0){
                j--;
            }
            else{
                i++;
            }
        }
        return nums;
    }
}
