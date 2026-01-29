package Patterns;

import java.util.Scanner;

public class Pattern_22 {
    /*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
     */
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int n = input.nextInt();
        pattern(n);

    }
    static void pattern(int n) {

        for (int i = 1; i <= n; i++) {

            for(int j = 1; j<=i; j++){
                int num = (i +j) % 2 == 0? 1 : 0;
                System.out.print(num + " ");

            }

            System.out.println();
        }
    }
}
