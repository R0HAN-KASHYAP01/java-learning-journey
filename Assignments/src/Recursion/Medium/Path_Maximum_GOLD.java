package Recursion.Medium;

public class Path_Maximum_GOLD {


    static void main(String[] args) {
        int[][] grid = {
                {0,6,0},{5,8,7},{0,9,0}
        };
        int ans = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                ans = Math.max(ans,backtrack(grid,i,j));
            }
        }
        System.out.println(ans);
    }
    static public int backtrack(int[][] grid,int r,int c){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length){
            return 0;
        }
        if(grid[r][c] == 0){
            return 0;
        }
        int current = grid[r][c];
        grid[r][c] = 0;

        int right = backtrack(grid, r, c + 1);
        int left  = backtrack(grid, r, c - 1);
        int up    = backtrack(grid, r - 1, c);
        int down  = backtrack(grid, r + 1, c);

        grid[r][c] = current;

        return current + Math.max(Math.max(right, left), Math.max(up, down));



    }
}
