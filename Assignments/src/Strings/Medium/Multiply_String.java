package Strings.Medium;

public class Multiply_String {
    static void main(String[] args) {
        System.out.println(multiply("2", "3"));
    }
    static public String multiply(String num1, String num2) {
        int n1 = 0;
        int n2 = 0;
        for(char ch : num1.toCharArray()){
            int temp = ch - '0';
            n1 = n1* 10 + temp;
        }
        for(char ch : num2.toCharArray()){
            int temp = ch - '0';
            n2 = n2 * 10 + temp;
        }
        int result = n1 * n2;
        return String.valueOf(result);
    }
}
