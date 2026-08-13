package Stack_Queue.Easy;

import java.util.Scanner;

public class Valid_Paranthese {
//    LeetCode: 20. Valid Parentheses

    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Example 5:
Input: s = "([)]"
Output: false


Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
     */

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = in.nextLine();
        if(isValid(str)){
            System.out.println("Brackets are valid!");

        }
        else{
            System.out.println("Brackets are not valid!");
        }



    }

    public static boolean isValid(String s) {

        int top = -1;
        char[] stack = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{') {
                stack[++top] = ch;
            }
            else {

                if(top == -1)
                    return false;

                if(!valid(stack[top], ch))
                    return false;

                top--;
            }
        }

        return top == -1;
    }

    public static boolean valid(char open, char close) {

        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }
}
