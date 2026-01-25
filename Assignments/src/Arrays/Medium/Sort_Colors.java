package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Colors {
//    Leet Code: 75. Sort Colors

    /*
    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
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
        sortColors(num);
        System.out.println(Arrays.toString(num));
    }
    static public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }
            else if (nums[i] == 1){
                one++;
            }
            else{
                two++;
            }
        }
        for(int i = 0; i<zero; i++){
            nums[i] = 0;
        }
        for(int i = zero; i< zero+one; i++){
            nums[i] = 1;
        }
        for(int i = zero+one; i< zero+one+two; i++){
            nums[i] = 2;
        }
    }
}
