package Day2_Loops;

import java.util.Scanner;

public class occurens {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = in.nextInt();
        System.out.println("Enter a digit to found: ");
        int dig = in.nextInt();
        int times = 0;
        while(num / 10 != 0){
            int temp = num % 10;
            if(temp == dig){
                times++;
            }
            num = num / 10;
        }
        System.out.println("Times are: " + times);

    }
}
