package Searching.Medium;

import java.util.Scanner;

public class Search_2D_Matrix {
//    LeetCOde: 74. Search a 2D Matrix

    /*
    You are given an m x n integer  matrix with the following two properties:

    Each row is sorted in non-decreasing order.
    The first integer of each row is greater than the last integer of the previous row.
    Given an integer target, return true if target is in matrix or false otherwise.

    You must write a solution in O(log(m * n)) time complexity.


    Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
    Output: true

    Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
    Output: false

     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int row = input.nextInt();
        System.out.println("Enter the size of the column: ");
        int col = input.nextInt();
        System.out.println("Enter the elements of the Matrix: ");
        int[][] mat = new int[row][col];
        for (int i = 0; i<row;i++){
            for (int j = 0; j<col; j++){
                mat[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the target element: ");
        int target = input.nextInt();
        System.out.println(searchMatrix(mat,target));

    }
    static public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;
        while(i<matrix.length && j >=0 ){
            if(matrix[i][j] > target){
                j--;
            }
            else if(matrix[i][j] < target){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
