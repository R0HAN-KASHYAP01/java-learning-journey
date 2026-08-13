package Sorting.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Set_MisMatch {
//    LeetCode: 645. Set Mismatch

    /*
    You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.



Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]


Constraints:
2 <= nums.length <= 104
1 <= nums[i] <= 104
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
        System.out.println(Arrays.toString(findErrorNums(num)));
    }
    static public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];

        int miss = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                ans[0] = n;

            }
            map.put(n,1);
        }
        for(int i = 1; i<=nums.length;i++){
            if(map.get(i) == null){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}
