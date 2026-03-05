package Sorting.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Rank_Transform_Array {
//    LeetCode : 1331. Rank Transform of an Array

    /*
    Given an array of integers arr, replace each element with its rank.

        The rank represents how large the element is. The rank has the following rules:

        Rank is an integer starting from 1.
        The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
        Rank should be as small as possible.


        Example 1:
        Input: arr = [40,10,20,30]
        Output: [4,1,2,3]
        Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.

        Example 2:
        Input: arr = [100,100,100]
        Output: [1,1,1]
        Explanation: Same elements share the same rank.

        Example 3:
        Input: arr = [37,12,28,9,100,56,80,5,12]
        Output: [5,3,4,2,8,6,7,1,3]


        Constraints:
        0 <= arr.length <= 105
        -109 <= arr[i] <= 109
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<size; i++){
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arrayRankTransform(nums)));
    }
    static public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);

        HashMap<Integer,Integer> map = new HashMap<>();

        int rank = 1;

        for(int num : temp){
            if(!map.containsKey(num)){
                map.put(num, rank);
                rank++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;

    }
}
