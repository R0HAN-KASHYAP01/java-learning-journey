package Searching.Easy;

import java.util.Scanner;

public class Arranging_Coins {
//    LeetCode: 441. Arranging Coins

    /*
    You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2

Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of coins: ");
        int num = input.nextInt();

        System.out.println(arrangeCoins(num));
    }
    static public int arrangeCoins(int n) {
        int i = 1;

        while(n >0){
            n = n -i;
            i++;
        }
        if(n == 0){
            return i-1;
        }
        return i-2;
    }
}
