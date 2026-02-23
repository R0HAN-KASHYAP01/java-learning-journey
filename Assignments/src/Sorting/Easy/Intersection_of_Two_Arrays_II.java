package Sorting.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Intersection_of_Two_Arrays_II {

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
        int x = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array 1: ");
        int size1 = input.nextInt();
        int[] nums1 = new int[size1];
        System.out.println("Enter the elements of the array 1: ");
        for (int i = 0; i<size1; i++){
            nums1[i] = input.nextInt();
        }
        System.out.println("Enter the size of array 2: ");
        int size2 = input.nextInt();
        int[] nums2 = new int[size2];
        System.out.println("Enter the elements of the array 2: ");
        for (int i = 0; i<size2; i++){
            nums2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    static public int[] intersect(int[] nums1, int[] nums2) {

        int[] freq = new int[1001];

        for (int n : nums1) {
            freq[n]++;
        }

        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int n : nums2) {
            if (freq[n] > 0) {
                temp[k++] = n;
                freq[n]--;
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
