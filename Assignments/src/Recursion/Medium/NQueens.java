package Recursion.Medium;

import java.util.Arrays;

import static Arrays.Cells_OddValue_matrix.display;

public class NQueens {
//    There is a NXN board with N queens of chess. You have to put all the queens in the board in a way that they will not take each other (not come in their path)

    static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        Queens(board,0);
    }

    static void Queens(boolean[][] board, int r){
        if(r == board.length){
            display(board);
            System.out.println();
            return;
        }
        for(int c = 0; c < board.length; c++){
            if(isSafe(board,r,c)){
                board[r][c] = true;
                Queens(board,r+1);
                board[r][c] = false;
            }
        }
    }
    static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean ele : row){
                if(ele) System.out.print("Q ");
                else System.out.print("X ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] board, int r , int c){
        for(int i = 0; i < r; i++){
            if(board[i][c]) return  false;
        }

        int minRight = Math.min(r,board.length-c-1);
        for(int i = 1; i<=minRight; i++){
            if(board[r-i][c+i]) return false;
        }
        int minLeft = Math.min(r,c);
        for(int i = 1; i <= minLeft; i++){
            if(board[r-i][c-i]) return false;
        }
        return true;
    }
}
