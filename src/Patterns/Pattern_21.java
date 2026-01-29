package Patterns;

import java.util.Scanner;

public class Pattern_21 {
    /*
       1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
     */
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int n = input.nextInt();
        pattern(n);

    }
    static void pattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
