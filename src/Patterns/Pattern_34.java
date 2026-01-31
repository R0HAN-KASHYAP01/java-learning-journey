package Patterns;

import java.util.Scanner;

public class Pattern_34 {
    /*
       1      1
       12    21
       123  321
       12344321
     */
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int n = input.nextInt();
        pattern(n);

    }
    static void pattern(int n){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(j);
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
