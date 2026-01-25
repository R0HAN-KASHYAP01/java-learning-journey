package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Diagonal_sum {
//    LeetCode : 1572. Matrix Diagonal Sum

    /*
    Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.



Example 1:

Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
Example 3:

Input: mat = [[5]]
Output: 5
     */

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row of 2D array: ");
        int row = input.nextInt();
        System.out.println("Enter the column of 2D array: ");
        int column = input.nextInt();

        int[][] nums = new int[row][column];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i< row; i++){
            for (int j = 0; j < column; j++) {

                nums[i][j] = input.nextInt();
            }
        }

        int ans = diagonalSum(nums);
        System.out.println(ans);
    }
    static  public int diagonalSum(int[][] mat) {
        int sum = 0;
        int j = mat.length-1;
        for(int i = 0; i<mat.length; i++){
            if(i == j-i){
                sum += mat[i][i];
            }
            else{

                sum += mat[i][i] + mat[i][j-i];
            }
        }
        return sum;
    }
}
