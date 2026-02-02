package Searching.Easy;

import java.util.Scanner;

public class Count_Negative_numbers_Sorted_Matrix {
//    LeetCOde: 1351. Count Negative Numbers in a Sorted Matrix

    /*
    Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

        Example 1:

        Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
        Output: 8
        Explanation: There are 8 negatives number in the matrix.
        Example 2:

        Input: grid = [[3,2],[1,0]]
        Output: 0

     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the row: ");
        int row = input.nextInt();
        System.out.println("Enter the size of the column: ");
        int col = input.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[][] arr = new int[row][col];
        for (int i = 0; i<row; i++){
            for(int j = 0; j< col; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Total numbers of negative number: ");
        System.out.println(countNegatives(arr));
    }
    static public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i = 0; i<m; i++){
            int start = 0;
            int end = n-1;
            while(start <= end){
                int mid = start + (end-start)/2;
                if(grid[i][mid] >=  0){
                    start = mid+1;
                }
                else if(grid[i][mid] < 0){
                    end = mid-1;
                }
            }
            count = count + n - end-1;
        }
        return count;
    }
}
