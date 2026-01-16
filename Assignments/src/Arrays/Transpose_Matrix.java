package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose_Matrix {
//    Leet Code: 867. Transpose Matrix

    /*
    Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
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
        int[][] mat = transpose(nums);
        for (int i = 0;i< mat.length;i++){
            System.out.println(Arrays.toString(mat[i]));
        }
    }
    static public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] mat = new int[n][m];
        for(int i = 0; i<m; i++){
            int k = 0;
            for(int j = 0; j<n;j++,k++){
                mat[k][i] = matrix[i][j];
            }
        }
        return mat;
    }
}
