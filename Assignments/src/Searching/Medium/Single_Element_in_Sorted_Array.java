package Searching.Medium;

import java.util.Scanner;

public class Single_Element_in_Sorted_Array {
//    LeetCode: 540. Single Element in a Sorted Array

    /*
    You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

        Return the single element that appears only once.

        Your solution must run in O(log n) time and O(1) space.



        Example 1:
        Input: nums = [1,1,2,3,3,4,4,8,8]
        Output: 2

        Example 2:
        Input: nums = [3,3,7,7,10,11,11]
        Output: 10
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] nums = new int[size];
        for (int i = 0; i<size; i++){
            nums[i] = input.nextInt();
        }
        System.out.println("Single Element is: ");
        System.out.println(singleNonDuplicate(nums));
    }
    static public int singleNonDuplicate(int[] nums) {
        int start =0;
        int end = nums.length-1;
        int size = nums.length-1;
        if(end == 0){
            return nums[0];
        }
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            else if (nums[mid] != nums[mid-1]){
                if(mid % 2 == 0){
                    start = mid;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                int x = size - mid;
                if(x % 2 == 0){
                    end = mid;
                }
                else{
                    start = mid+1;
                }

            }
        }
        return nums[end];
    }
}
