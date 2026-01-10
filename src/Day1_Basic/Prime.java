package Day1_Basic;

import java.util.Scanner;

public class Prime {
    static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n <= 1){
            System.out.println("Neither prime nor Composite");

        }
        int c = 2;
        while(c*c <= n){
            if(n %c == 0){
                System.out.println("Not Prime");
                return;
            }
            c = c+1;
        }
        if(c * c > n){
            System.out.println("Prime");
        }
    }
}
