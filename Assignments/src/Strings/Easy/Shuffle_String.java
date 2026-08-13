package Strings.Easy;

import java.util.Scanner;

public class Shuffle_String {
//    LeetCode: 1528. Shuffle String
    /*
    You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.



Example 1:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

Example 2:
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.


Constraints:
s.length == indices.length == n
1 <= n <= 100
s consists of only lowercase English letters.
0 <= indices[i] < n
All values of indices are unique.
     */
static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str = in.nextLine();
    System.out.println("Enter the indices: ");
    int[] indices = new int[str.length()];
    for(int i = 0; i<str.length(); i++){
        indices[i] = in.nextInt();
    }
    System.out.println("String is: "+ restoreString(str,indices));
}

        static public String restoreString(String s, int[] indices) {

            char[] ans = new char[s.length()];

            for(int i = 0; i < s.length(); i++) {
                ans[indices[i]] = s.charAt(i);
            }

            return new String(ans);
        }

}
