package Recursion.Easy;

public class Maze2 {
//    Here, there is Maze but there is an obstacle in the maze and go have to skip that cell and try to reach the end. And we only use Right and Down movement.
static void main(String[] args) {
    boolean[][] mat = {
            {true, true,true},
            {true, false,true},
            {true, true,true}
    };
    Path("", mat, 0,0);


}

static void Path(String p , boolean[][] mat, int r , int c){
    if(!mat[r][c]){
        return;
    }
    if(r == mat.length-1 && c == mat[0].length-1){
        System.out.println(p);
        return;
    }
    if(c < mat[0].length-1){
        Path(p + "R", mat,r, c+1);
    }
    if(r < mat.length-1){
        Path(p + "D", mat,r+1,c);
    }

}
}
