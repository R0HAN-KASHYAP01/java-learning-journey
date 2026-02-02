package Searching.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Sum_II_Sorted_Array {
//    LeetCode: 167. Two Sum II - Input Array Is Sorted

    /*
    Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.



Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].

     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the value of target: ");
        int target = input.nextInt();
        System.out.println("The index of numbers are: ");
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static public int[] twoSum(int[] numbers, int target) {
        int[] result = {-1,-1};
        int start = 0;
        int end = numbers.length-1;
        while(start< end){
            int sum = numbers[start] + numbers[end];
            if(sum > target){
                end--;
            }
            else if(sum < target){
                start++;
            }
            else{
                result[0] = start+1;
                result[1] = end+1;
                return result;
            }


        }
        return result;
    }
}
