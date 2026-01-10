package Day2_Loops;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int result = in.nextInt();
        char op;
        do {
            System.out.println("Enter the operation: ");
            op = in.next().trim().charAt(0);
            if(op == '+'){
                System.out.println("Enter the number: ");
                int num = in.nextInt();
                result = result + num;
            } else if (op == '-') {
                System.out.println("Enter the number: ");
                int num = in.nextInt();
                result = result - num;
            }
            else if (op == '*') {
                System.out.println("Enter the number: ");
                int num = in.nextInt();
                result = result * num;
            }
            else if (op == '/') {
                System.out.println("Enter the number: ");
                int num = in.nextInt();
                result = result / num;
            }
            else if(op == 'X' || op == 'x'){
                break;
            }
        }while(op != '=');
        System.out.println(result);
    }
}
