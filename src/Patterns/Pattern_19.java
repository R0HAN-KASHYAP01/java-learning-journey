package Patterns;

import java.util.Scanner;

public class Pattern_19 {
    /*

       *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *

     */
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int n = input.nextInt();
        pattern(n);

    }
    static void pattern(int n){
        for(int i =1; i<2*n; i++){
            int row = i <= n ? i : 2*n -i ;
            for(int j = 1; j<=2*n; j++){
                if(j <= row || j >= 2*n-row+1){
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
