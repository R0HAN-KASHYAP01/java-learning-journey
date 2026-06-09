package Searching.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Intersection_Two_Array_II {
//    LeetCode: 350. Intersection of Two Arrays II

    /*
    Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
     */

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int s1 = in.nextInt();
        System.out.println("Enter the size of second array: ");
        int s2 = in.nextInt();
        int[] nums1 = new int[s1];
        int[] nums2 = new int[s2];
        System.out.println("Enter the element of the first array: ");
        for (int i = 0; i<s1; i++){
            nums1[i] = in.nextInt();
        }
        System.out.println("Enter the element of the second array: ");
        for (int i = 0; i<s2; i++){
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }

    static  public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        for (int n: nums1){
            freq[n]++;
        }
        int[] temp = new int[Math.min(nums1.length,nums2.length)];
        int k = 0;
        for (int n: nums2){
            if(freq[n] > 0){
                freq[n]--;
                temp[k++] = n;
            }
        }
        int[] result = new int[k];
        for (int i = 0; i<k;i++){
            result[i] = temp[i];
        }
        return result;
    }
}
