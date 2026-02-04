package Searching.Medium;

public class Reach_Number {
    static void main(String[] args) {
        System.out.println(reachNumber(4));
    }
    static public int reachNumber(int target) {
        int s = 0;
        int e = target;
        int numMoves = 1;
        while(s != e){
            int x = s+numMoves;
            if(s+numMoves < target){
                s = s+numMoves;
                numMoves++;
            }
            else if(s+ numMoves > target){
                s =  s - numMoves;
                numMoves++;
            }
            else{
                return numMoves;
            }

        }
        return numMoves;
    }
}
