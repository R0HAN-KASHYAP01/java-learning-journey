package Patterns;

import java.util.Scanner;

public class Pattern_32 {
    static void main(String[] args) {
        /*
       a
       B c
       D e F
       g H i J
       k L m N o
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int n = input.nextInt();
        pattern(n);

    }
    static void pattern(int n){
        int num = 0;
        for(int i =1; i<=n; i++){
            for(int j = 1; j<= i; j++){
                char letter = num % 2 == 1? (char) ('A' + num) : (char)('a' + num);
                System.out.print(letter + " ");
                num++;
            }
            System.out.println();
        }
    }
}
