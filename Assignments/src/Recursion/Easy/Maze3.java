package Recursion.Easy;

import java.util.Arrays;

public class Maze3 {
//    Here, we can move to any direction and we have to reach all the ends.
static void main(String[] args) {
    boolean[][] mat = {
            {true, true,true},
            {true, true,true},
            {true, true,true}
    };
//    System.out.println(Path_count(mat,0,0));
//    Paths("",mat,0,0);
    int[][] pat = new int[3][3];
//    Path_mat("",mat,0,0,pat,1);

}


//  Here, we return the total number of ways to reach the end.
    static int Path_count(boolean[][] mat, int r, int c){

        if(!mat[r][c]){
            return 0;
        }

        if(r == mat.length-1 && c == mat[0].length-1){
            return 1;
        }

        mat[r][c] = false;

        int total = 0;

        if(c < mat[0].length-1){
            total += Path_count(mat,r,c+1);
        }

        if(r < mat.length-1){
            total += Path_count(mat,r+1,c);
        }

        if(r > 0){
            total += Path_count(mat,r-1,c);
        }

        if(c > 0){
            total += Path_count(mat,r,c-1);
        }

        mat[r][c] = true;

        return total;
    }

//  Here, we show all the ways to reach the end.
    static void Paths(String p, boolean[][] mat, int r, int c){
        if(!mat[r][c]){
            return;
        }
        if(r == mat.length-1 && c == mat[0].length-1){
            System.out.println(p);
            return;
        }

        mat[r][c] = false;

        if(c < mat[0].length-1){
            Paths(p + "R",mat,r,c+1);
        }
        if(r < mat.length-1){
            Paths(p + "D",mat,r+1,c);
        }
        if(c > 0){
            Paths(p + "L",mat,r , c-1);
        }
        if(r > 0){
            Paths(p + "U", mat, r-1, c);
        }

        mat[r][c] = true;
    }

//    Here, we show all the path to reach end with the step in matrix.
    static void Path_mat(String p,boolean[][] mat, int r, int c , int[][] pat , int step){
    if(!mat[r][c]){
        return;
    }
    if(r == mat.length-1 && c == mat[0].length-1){
        pat[r][c] = step;
        for(int[] arr : pat){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(p);
        System.out.println();
        return;
    }
    mat[r][c] = false;
    pat[r][c] = step;
        if(c < mat[0].length-1){
            Path_mat(p + "R",mat,r,c+1,pat,step+1);
        }
        if(r < mat.length-1){
            Path_mat(p + "D",mat,r+1,c,pat,step+1);
        }
        if(c > 0){
            Path_mat(p + "L",mat,r , c-1,pat,step+1);
        }
        if(r > 0){
            Path_mat(p + "U", mat, r-1, c,pat,step+1);
        }
        mat[r][c] = true;

    }
}
