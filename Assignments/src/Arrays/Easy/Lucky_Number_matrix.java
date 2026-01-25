package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lucky_Number_matrix {
//    Leet Code: 1380. Lucky Numbers in a Matrix

    /*
    Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.



Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row of 2D array: ");
        int row = input.nextInt();
        System.out.println("Enter the column of 2D array: ");
        int column = input.nextInt();

        int[][] matrix = new int[row][column];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i< row; i++){
            for (int j = 0; j < column; j++) {

                matrix[i][j] = input.nextInt();
            }
        }

        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans.getFirst());
    }
        static public List<Integer> luckyNumbers(int[][] matrix) {

            List<Integer> list = new ArrayList<>();

            int m = matrix.length;
            int n = matrix[0].length;

            for (int i = 0; i < m; i++) {

                // find row minimum
                int min = matrix[i][0];
                int minIdx = 0;

                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                        minIdx = j;
                    }
                }

                // check if column max
                boolean isLucky = true;
                for (int k = 0; k < m; k++) {
                    if (matrix[k][minIdx] > min) {
                        isLucky = false;
                        break;
                    }
                }

                if (isLucky) {
                    list.add(min);
                }
            }

            return list;
        }

}
