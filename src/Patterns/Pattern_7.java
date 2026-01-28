package Patterns;

import java.util.Scanner;

public class Pattern_7 {
    /*

     *****
      ****
       ***
        **
         *

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
            for(int j = 1; j<i; j++){
                System.out.print(" ");
            }
            for(int j = i;j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
