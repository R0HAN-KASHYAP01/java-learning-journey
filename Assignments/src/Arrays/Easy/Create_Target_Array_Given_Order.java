package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Create_Target_Array_Given_Order {
//    LeetCode : 1389. Create Target Array in the Given Order

    /*
    Given two arrays of integers nums and index. Your task is to create target array under the following rules:

        Initially target array is empty.
        From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
        Repeat the previous step until there are no elements to read in nums and index.
        Return the target array.

        It is guaranteed that the insertion operations will be valid.



        Example 1:

        Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        Output: [0,4,1,3,2]
        Explanation:
        nums       index     target
        0            0        [0]
        1            1        [0,1]
        2            2        [0,1,2]
        3            2        [0,1,3,2]
        4            1        [0,4,1,3,2]
        Example 2:

        Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
        Output: [0,1,2,3,4]
        Explanation:
        nums       index     target
        1            0        [1]
        2            1        [1,2]
        3            2        [1,2,3]
        4            3        [1,2,3,4]
        0            0        [0,1,2,3,4]
        Example 3:

        Input: nums = [1], index = [0]
        Output: [1]
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Enter the nums array: ");
        int[] nums = new int[size];
        for (int i = 0; i<size; i++){
            nums[i] = input.nextInt();
        }
        System.out.println("Enter the index array: ");
        int[] index = new int[size];
        for (int i = 0; i<size; i++){
            index[i] = input.nextInt();
        }
        System.out.println("Final Array: ");
        System.out.println(Arrays.toString(createTargetArray(nums,index)));

    }
    static public int[] createTargetArray(int[] nums, int[] index) {
        int size = nums.length;
        int[] ans = new int[size];
        int i= 0;
        while(i < size){
            int num = nums[i];
            int ind = index[i];
            for(int k = size-1; k>ind; k--){
                ans[k] = ans[k-1];
            }
            ans[ind] = num;
            i++;
        }
        return ans;
    }
}
