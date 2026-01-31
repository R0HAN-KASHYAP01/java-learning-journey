package Patterns;

import java.util.Scanner;

public class Pattern_26 {
    /*
    1 1 1 1 1 1
    2 2 2 2 2
    3 3 3 3
    4 4 4
    5 5
    6
     */
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int n = input.nextInt();
        pattern(n);

    }
    static void pattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= n-i+1; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
