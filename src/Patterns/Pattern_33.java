package Patterns;

import java.util.Scanner;

public class Pattern_33 {
    /*
       E D C B A
       D C B A
       C B A
       B A
       A

     */
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of pattern: ");
        int n = input.nextInt();
        pattern(n);

    }
    static void pattern(int n){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<= n-i+1; j++){
                char letter = (char) ('A' + n-j);
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }
}
