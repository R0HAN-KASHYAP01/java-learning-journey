package Patterns;

import java.util.Scanner;

public class Pattern_31 {
    /*
       E
       D E
       C D E
       B C D E
       A B C D E
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
                char letter = (char) ('A' + n - i + j - 1);
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }
}
