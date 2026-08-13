package Recursion.Easy;

import java.util.ArrayList;
import java.util.List;

public class Maze1 {
//    Here we can only use 2 moves to travel a Maze that is Down and Right only.
    static void main(String[] args) {
//        System.out.println(Count_Path(3,3));
//        Print_Path("",3,3);
        ArrayList<String> ans = new ArrayList<>();
        System.out.println(Paths("", 3,3,ans));
    }


//    Here, we count the total number of ways to reach the end of the maze only using Down and Right movement.
    static int Count_Path(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = Count_Path(r-1, c);
        int right = Count_Path(r, c-1);
        return left + right;
    }

//    Here, we print all the ways to reach the end of the Maze.
    static void Print_Path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(c > 1){
            Print_Path(p+ "R",r,c-1);
        }
        if(r > 1){
            Print_Path(p + "D",r-1,c);
        }
    }

//    Here, we Store all the paths in the ArrayList.
    static ArrayList<String> Paths(String p, int r, int c, ArrayList<String> lst){
        if(r == 1 && c == 1){
            lst.add(p);

        }
        if(c > 1){
            Paths(p + "R" , r ,c-1,lst);
        }
        if(r > 1){
            Paths(p+ "D", r-1, c , lst);
        }
        return lst;
    }
}
