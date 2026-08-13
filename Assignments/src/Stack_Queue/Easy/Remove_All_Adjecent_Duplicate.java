package Stack_Queue.Easy;

import java.util.Scanner;
import java.util.Stack;

public class Remove_All_Adjecent_Duplicate {
    // 1047. Remove All Adjacent Duplicates In String

    /*
        You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.



Example 1:
Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

Example 2:
Input: s = "azxxzy"
Output: "ay"


Constraints:
1 <= s.length <= 105
s consists of lowercase English letters.
     */

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = in.nextLine();
        System.out.println(removeDuplicates(str));
        System.out.println(removeDuplicates2(str));
    }
    // Method 1: This method is using Stack to solve that take extra O(N) space with O(N) time.
    public static  String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }
            else{
                st.push(ch);
            }

        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }

    // Method 2: This is another way to solve this without using stack and done in O(N) time and O(1) space\
    public static String removeDuplicates2(String s){
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            int lastIndex = ans.length()-1;
            if(ans.length() > 0 && ans.charAt(lastIndex) == ch){
                ans.deleteCharAt(lastIndex);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
