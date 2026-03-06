package Sorting.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Relative_sort_Array {

//    LeetCode: 1122. Relative Sort Array

    /*
    Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

        Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

        Example 1:
        Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
        Output: [2,2,2,1,4,3,3,9,6,7,19]

        Example 2:
        Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
        Output: [22,28,8,6,17,44]

        Constraints:
        1 <= arr1.length, arr2.length <= 1000
        0 <= arr1[i], arr2[i] <= 1000
        All the elements of arr2 are distinct.
        Each arr2[i] is in arr1.
     */
    static void main(String[] args) {
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
        System.out.println(Arrays.toString(relativeSortArray(nums1,nums2)));
    }
   static public int[] relativeSortArray(int[] arr1, int[] arr2) {
       int[] freq = new int[1001];
       for (int i = 0; i < arr1.length; i++) {
           freq[arr1[i]]++;
       }
       int k = 0;
       int i = 0;
       while (k < arr2.length) {
           if (freq[arr2[k]] == 0) {
               k++;
           } else {
               arr1[i] = arr2[k];
               i++;
               freq[arr2[k]]--;
           }

       }
       int s = 0;
       while (i < arr1.length) {
           if (freq[s] == 0) {
               s++;
           } else {
               arr1[i] = s;
               i++;
               freq[s]--;
           }
       }
       return arr1;
   }
}
