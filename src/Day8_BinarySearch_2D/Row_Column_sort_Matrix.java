package Day8_BinarySearch_2D;

import java.util.Arrays;
import java.util.Scanner;

public class Row_Column_sort_Matrix {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int row = input.nextInt();
        System.out.println("Enter the size of the column: ");
        int col = input.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter the value in matrix: ");
        for (int i = 0 ; i<row; i++){
            for (int j = 0; j<col; j++){
                mat[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the target: ");
        int target = input.nextInt();
        System.out.println(Arrays.toString(binarySearch2d(mat,target)));
    }

    static int[] binarySearch2d(int[][] matrix,int target){
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
                if(matrix[row][col] == target){
                    return new int[]{row,col};
                }
                if(matrix[row][col] < target){
                    row++;
                }
                else{
                    col--;
                }
        }
        return new int[] {-1,-1};
    }
}
