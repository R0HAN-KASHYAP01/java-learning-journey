package Searching.Easy;

import java.util.Scanner;

public class Kth_Missing_Positive_Number {
//    LeetCode: 1539. Kth Missing Positive Number
    /*
    Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.



Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
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
        System.out.println("Enter the value of k: ");
        int k = input.nextInt();
        System.out.println("The Kth positive integer is: ");
        System.out.println(findKthPositive(arr,5));
    }
    static public int findKthPositive(int[] arr, int k) {int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            int missing = arr[mid] - (mid+1);
            if(missing < k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return end + k +1;
    }
}
