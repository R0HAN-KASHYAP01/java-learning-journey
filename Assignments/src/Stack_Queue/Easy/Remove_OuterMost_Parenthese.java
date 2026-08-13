package Stack_Queue.Easy;

import java.util.Scanner;
import java.util.Stack;

public class Remove_OuterMost_Parenthese {
//    LeetCode: 1021. Remove Outermost Parentheses
    /*
    A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.



Example 1:

Input: s = "(()())(())"
Output: "()()()"
Explanation:
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
Example 2:

Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation:
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
Example 3:

Input: s = "()()"
Output: ""
Explanation:
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".


Constraints:

1 <= s.length <= 105
s[i] is either '(' or ')'.
s is a valid parentheses string.
     */

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = in.nextLine();
        System.out.println(removeOuterParentheses(str));
        System.out.println(removeOuterParentheses2(str));
    }

//    Method 1: This method is using Stack to solve that take extra O(N) space with O(N) time.
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        int i = 0;
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) == '('){
                stack.push('(');
            }
            if(!stack.isEmpty() && s.charAt(j) == ')'){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans.append(s.substring(i+1,j));
                i = j+1;
            }
        }
        return ans.toString();
    }

//    Method 2: This is another way to solve this without using stack and done in O(N) time and O(1) space
    public static String removeOuterParentheses2(String s){
        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(depth > 0) ans.append(ch);
                depth++;
            }
            else{
                depth--;
                if(depth > 0) ans.append(ch);
            }

        }
        return ans.toString();
    }

}
