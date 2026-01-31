package Patterns;

import java.util.Scanner;

public class Pattern_29 {
    /*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
     */
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int n = input.nextInt();
        pattern(n);

    }
    static void pattern(int n){
        for(int i =1; i<=n; i++){
            for (int space = 1; space <= n -i; space++){
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++){
                int num = j <= i ? i-j+1 : j-i+1;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
