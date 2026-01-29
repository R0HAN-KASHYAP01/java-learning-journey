package Patterns;

import java.util.Scanner;

public class Pattern_13 {
    /*

         *
        * *
       *   *
      *     *
     *********
     */
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int n = input.nextInt();
        pattern(n);

    }
    static void pattern(int n){
        for(int i =1; i<=n; i++){
            for (int space = 1; space <= n-i; space++){
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*i-1; col++){
                if (col == 1 || i== n || col == 2*i-1){
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
