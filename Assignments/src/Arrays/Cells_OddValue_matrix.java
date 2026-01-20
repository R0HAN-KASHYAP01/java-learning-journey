package Arrays;

import java.util.Scanner;

public class Cells_OddValue_matrix {

//    Leet Code: 1252. Cells with Odd Values in a Matrix

    /*
    There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
     */

    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the row of 2D array: ");
//        int row = input.nextInt();
//        System.out.println("Enter the column of 2D array: ");
//        int column = input.nextInt();
//
//        int[][] nums = new int[row][column];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i< row; i++){
//            for (int j = 0; j < column; j++) {
//
//                nums[i][j] = input.nextInt();
//            }
//        }

        int m = 1;
        int n = 1;
        int[][] ind = {
                {0,0},{0,0}
        };
        System.out.println(oddCells(m,n,ind));

    }
    static public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        int count = 0;
        for(int i= 0; i<indices.length;i++){
            int z = indices[i][0];
            for(int j = 0; j<n; j++){
                mat[z][j] = mat[z][j] + 1;
            }
        }
        display(mat,m,n);

//         adding columns
        for(int i= 0; i<indices.length;i++){
            int k = indices[i][1];
            for(int j = 0; j<m; j++){
                mat[j][k] = mat[j][k] +1;
            }
        }
            display(mat,m,n);

        for(int i = 0; i<m;i++){
            for(int j = 0; j<n;j++){
                if(mat[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;

    }
    static public void display(int[][] mat,int m,int n){
        for (int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
