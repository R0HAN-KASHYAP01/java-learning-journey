package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reshape_Matrix {
//    LeetCode: 566. Reshape the Matrix

    /*
    In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
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
        System.out.println("Enter the new row of 2D array: ");
        int row1 = input.nextInt();
        System.out.println("Enter the new column of 2D array: ");
        int column1 = input.nextInt();
        int[][] new_mat = matrixReshape(matrix,row1,column1);
        for (int i = 0; i<row1;i++){
            System.out.println(Arrays.toString(new_mat[i]));
        }

    }

    static public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] newMat = new int[r][c];

        for (int i = 0; i < m * n; i++) {
            newMat[i / c][i % c] = mat[i / n][i % n];
        }

        return newMat;
    }
}
