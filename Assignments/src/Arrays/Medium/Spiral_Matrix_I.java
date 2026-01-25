package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spiral_Matrix_I {
//   Leet Code :  54. Spiral Matrix

    /*
    Given an m x n matrix, return all elements of the matrix in spiral order.

    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [1,2,3,6,9,8,7,4,5]

    Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
    Output: [1,2,3,4,8,12,11,10,9,5,6,7]
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
        List<Integer> result = spiralOrder(nums);
        System.out.println(result);
    }
    static public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        List<Integer> spiral = new ArrayList<>();

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                spiral.add(matrix[top][i]);
            top++;

            for (int j = top; j <= bottom; j++)
                spiral.add(matrix[j][right]);
            right--;

            if (top <= bottom) {
                for (int k = right; k >= left; k--)
                    spiral.add(matrix[bottom][k]);
                bottom--;
            }

            if (left <= right) {
                for (int l = bottom; l >= top; l--)
                    spiral.add(matrix[l][left]);
                left++;
            }
        }

        return spiral;
    }
}
