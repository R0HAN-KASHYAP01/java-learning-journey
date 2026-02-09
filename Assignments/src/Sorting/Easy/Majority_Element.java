package Sorting.Easy;

import java.util.Scanner;

public class Majority_Element {

//    LeetCode: 169. Majority Element
    /*
    Given an array nums of size n, return the majority element.

        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

        Example 1:
        Input: nums = [3,2,3]
        Output: 3
        
        Example 2:
        Input: nums = [2,2,1,1,1,2,2]
        Output: 2
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of size: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the value of nums1: ");
        for (int i = 0; i<size; i++){
            nums[i] = input.nextInt();
        }
        System.out.println(majorityElement(nums));

    }
    static public int majorityElement(int[] nums) {
        int element = nums[0];
        int size = nums.length;
        int count = 0;
        for(int i = 1; i<size; i++){
            if(nums[i] == element){
                count++;
            }
            else{
                count--;
            }
            if(count < 0){
                element = nums[i];
                count++;
            }
        }

        return element;
    }
}
