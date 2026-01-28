package Patterns;

import java.util.Scanner;

public class Patern_14 {
    /*
     *********
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
        for(int i =1; i<=n; i++){
//          f

            if(i == n){
                for (int j = 1; j<= n-1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else if(i == 1){
                for (int j = 1; j <=2*n-1;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = 1; j<=i-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 1; j<2*(n-i);j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
