package Strings.Easy;

import java.util.Scanner;

public class To_Lower_Case {
    // LeetCode: 709. To Lower Case

    /*
    Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.



Example 1:
Input: s = "Hello"
Output: "hello"

Example 2:
Input: s = "here"
Output: "here"

Example 3:
Input: s = "LOVELY"
Output: "lovely"


Constraints:
1 <= s.length <= 100
s consists of printable ASCII characters.

     */

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        System.out.println(toLowerCase(str));
    }
    static public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
            ans.append((char) (ch + 'a'-'A'));
            }
            else ans.append(ch);
        }
        return ans.toString();
    }
}
