package Patterns;

import java.util.Scanner;

public class Pattern_8 {
    /*

         *
        ***
       *****
      *******
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
//            Print Spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
