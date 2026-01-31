package Patterns;

import java.util.Scanner;

public class Pattern_27 {
    /*
      1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11

     */
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int n = input.nextInt();
        pattern(n);

    }
    static void pattern(int n) {
        int start = 1;
        int end = n * (n + 1);

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s < i; s++) {
                System.out.print("  ");
            }

            int count = n - i + 1;

            // left side
            for (int j = 1; j <= count; j++) {
                System.out.print(start++ + " ");
            }

            // right side
            int temp = end - count + 1;
            for (int j = 1; j <= count; j++) {
                System.out.print(temp++ + " ");
            }

            end -= count;
            System.out.println();
        }
    }

}
