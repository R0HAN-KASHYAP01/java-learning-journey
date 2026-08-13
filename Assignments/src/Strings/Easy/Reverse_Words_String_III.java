package Strings.Easy;

import java.util.Scanner;

public class Reverse_Words_String_III {
    // LeetCode: 557. Reverse Words in a String III

    /*
    Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"


Constraints:
1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
     */

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        System.out.println(reverseWords(str));
    }
    static public String reverseWords(String s) {
        String[] ans = s.split(" ");
        for(int i = 0; i<ans.length; i++){
            ans[i] = new StringBuilder(ans[i]).reverse().toString();
        }
        return String.join(" ",ans);
    }
}
