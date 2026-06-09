package Arrays.Medium;

import java.util.Scanner;

public class Jump_Game {
//    LeetCode: 55. Jump Game
    /*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.


Example 1:
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:
Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.


Constraints:
1 <= nums.length <= 104
0 <= nums[i] <= 105
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
    System.out.println(canJump(num));
}
static public boolean canJump(int[] nums) {
    int n = nums.length;
    int i = 0;
    int maxReach = 0;
    while(i <= maxReach){
        maxReach = Math.max(maxReach , i + nums[i]);
        if(maxReach >= n-1) return true;
        i++;
    }
    return false;
}
}
