package Patterns;

import java.util.Scanner;

public class Pattern_24 {
    /*
       *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *

     */
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int n = input.nextInt();
        pattern(n);

    }
    static void pattern(int n) {

        for (int i = 1; i <= 2*n; i++) {
            for (int j = 1; j<= 2*n; j++){
                if(j == 1 || j == 2*n || j == i || j == 2*n-i+1){

                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
