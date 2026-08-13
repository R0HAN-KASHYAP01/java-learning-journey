package Recursion.Hard;


import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    static void main(String[] args) {
        solveNQueens(4);
    }

    public static List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = new ArrayList<>();
        return queens(board,0,ans);
    }
    public static  List<List<String>> queens(boolean[][] board,int r,List<List<String>> ans){
        if(r == board.length){
             ans.add(helper(board));
        }
        for(int c = 0; c < board.length; c++){
            if(is_Valid(board,r,c)){
                board[r][c] = true;
                queens(board,r+1,ans);
                board[r][c] = false;
            }
        }
        return ans;
    }
    public static List<String> helper(boolean[][] board){
        List<String> temp = new ArrayList<>();
        for(boolean[] row : board){
            StringBuilder t = new StringBuilder();
            for(boolean ele : row){
                if(ele){

                t.append("Q");
                }
                else t.append(".");
            }
        }
        return temp;
    }
    public static boolean is_Valid(boolean[][] board,int r, int c){
        for(int i = 0; i<r; i++){
            if(board[i][c]) return false;
        }

        int minRight = Math.min(r, board.length-c-1);
        for(int i = 1; i <= minRight; i++){
            if(board[r-i][c-i]) return  false;
        }

        int minLeft = Math.min(r,c);
        for(int i = 1; i<= minLeft; i++){
            if(board[r-i][c-i]) return false;
        }
        return true;
    }
}
