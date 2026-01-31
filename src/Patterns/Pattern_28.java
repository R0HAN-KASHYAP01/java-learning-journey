package Patterns;

import java.util.Scanner;

public class Pattern_28 {
    /*
         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
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
            int rows = i <= n ? i : 2*n -i;
            for (int space = 1; space <= n -rows; space++){
                System.out.print(" ");
            }
            for (int j = 1; j<= rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
