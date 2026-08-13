package Sorting.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Integers_By_Number_1_Bits {
//    LeetCode: 1356. Sort Integers by The Number of 1 Bits

    /*
    You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.

Return the array after sorting it.



Example 1:
Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
Explantion: [0] is the only integer with 0 bits.
[1,2,4,8] all have 1 bit.
[3,5,6] have 2 bits.
[7] has 3 bits.
The sorted array by bits is [0,1,2,4,8,3,5,6,7]

Example 2:
Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
Output: [1,2,4,8,16,32,64,128,256,512,1024]
Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.


Constraints:
1 <= arr.length <= 500
0 <= arr[i] <= 104
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
        System.out.println(Arrays.toString(sortByBits(num)));
    }
    static public int[] sortByBits(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            int encode = Integer.bitCount(arr[i]) * 10001 + arr[i];
            arr[i] = encode;
        }
        Arrays.sort(arr);
        for(int i = 0; i<arr.length;i++){
            arr[i] %= 10001;
        }
        return arr;
    }
}
