package Sorting.Easy;

import java.util.Scanner;

public class Height_Checker {
//    LeetCode: 1051. Height Checker

    /*
    A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

        You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

        Return the number of indices where heights[i] != expected[i].


        Example 1:
        Input: heights = [1,1,4,2,1,3]
        Output: 3
        Explanation:
        heights:  [1,1,4,2,1,3]
        expected: [1,1,1,2,3,4]
        Indices 2, 4, and 5 do not match.


        Example 2:
        Input: heights = [5,1,2,3,4]
        Output: 5
        Explanation:
        heights:  [5,1,2,3,4]
        expected: [1,2,3,4,5]
        All indices do not match.

        Example 3:
        Input: heights = [1,2,3,4,5]
        Output: 0
        Explanation:
        heights:  [1,2,3,4,5]
        expected: [1,2,3,4,5]
        All indices match.

        Constraints:
        1 <= heights.length <= 100
        1 <= heights[i] <= 100
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<size;i++){
            arr[i] = input.nextInt();
        }

        System.out.println(heightChecker(arr));
    }
    static public int heightChecker(int[] heights) {
        int count = 0;
        int[] freq = new int[101];
        for(int i = 0; i<heights.length; i++){
            freq[heights[i]]++;
        }
        int k = 0;
        int i = 0;
        while(i < heights.length){
            if(freq[k] == 0){
                k++;
            }
            else if(k != heights[i]){
                count++;
                freq[k]--;
                i++;
            }

            else{
                i++;
                freq[k]--;
            }
        }

        return count;
    }
}
