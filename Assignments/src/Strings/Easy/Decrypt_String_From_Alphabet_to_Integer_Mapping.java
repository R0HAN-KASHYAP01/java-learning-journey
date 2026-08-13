package Strings.Easy;

import java.util.Scanner;

public class Decrypt_String_From_Alphabet_to_Integer_Mapping {
    // Leetcode: 1309. Decrypt String from Alphabet to Integer Mapping

    /*
    You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.



Example 1:
Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

Example 2:
Input: s = "1326#"
Output: "acz"


Constraints:
1 <= s.length <= 1000
s consists of digits and the '#' letter.
s will be a valid string such that mapping is always possible.
     */

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        System.out.println(freqAlphabets(str));
    }
    static  public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            if( i+ 2 < s.length()&&s.charAt(i+2) == '#'){
                int temp = Integer.parseInt(s.substring(i,i+2));
                ans.append((char)('a'+ temp-1));
                i += 3;
            }
            else{
                int temp = s.charAt(i) - '0';
                ans.append((char) ('a'+ temp-1));
                i++;
            }
        }
        return ans.toString();
    }
}
