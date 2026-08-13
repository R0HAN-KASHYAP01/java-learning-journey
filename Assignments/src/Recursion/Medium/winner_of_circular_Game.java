package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class winner_of_circular_Game {
    static void main(String[] args) {
        System.out.println(findTheWinner(6,3));
    }

    static public int findTheWinner(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        for(int i = 1; i <=n; i++){
            temp.add(i);
        }
        int i = 0;
        while(temp.size() != 1){
            System.out.println(temp);
            int t = (i+k-1) % temp.size();
            temp.remove(t);
            i = t;
        }
        System.out.println(temp);
        return temp.get(0);
    }
}
