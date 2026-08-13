package Strings.Easy;

public class Check_Two_String_Array_Equivalent {
    // LeetCode : 1662. Check If Two String Arrays are Equivalent
    /*
    Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.



Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Example 2:
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

Example 3:
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true


Constraints:
1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.
     */
    static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    static public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int p1 = 0;
        int p2 = 0;
        int  i = 0;
        int j = 0;
        while(i < word1.length && j < word2.length){
            if(word1[i].charAt(p1) != word2[j].charAt(p2)){
                return false;
            }
            else{
                p1++;
                p2++;
            }
            if(p1 == word1[i].length()){
                p1 = 0;
                i++;
            }
            if(p2 == word2[j].length()){
                p2 = 0;
                j++;
            }
        }
        return  i == word1.length && j == word2.length;
    }
}
