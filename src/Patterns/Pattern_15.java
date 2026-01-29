package Patterns;

import java.util.Scanner;

public class Pattern_15 {

    /*
         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
     */
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int n = input.nextInt();
        pattern(n);

    }
    static void pattern(int n){

        for(int i =1; i<=2*n-1; i++){
            int row = i <= n ? i : 2*n-i;
            for (int space = 1; space<= n - row; space++){
                System.out.print(" ");
            }

            int cols = 2 * row -1;
            for (int col = 1; col <= cols; col++){
                if(col == 1 || col == cols){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
