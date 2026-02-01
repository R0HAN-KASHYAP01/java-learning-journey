package Searching.Easy;

import java.util.Scanner;



public class Guess_Number_High_Low {
    static int pick = 6;
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.println("Picked number is: ");
        System.out.println(guessNumber(num));
    }
    static public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid,pick);

            if (res == 0) {
                return mid;        // Correct number
            } else if (res == -1) {
                end = mid - 1;     // mid is too high
            } else {
                start = mid + 1;   // mid is too low
            }
        }
        return -1; // This will never happen
    }

    static int guess(int num,int pick){
        if(num > pick){
            return -1;
        }
        else if (num< pick){
            return 1;
        }
        return 0;
    }
}
