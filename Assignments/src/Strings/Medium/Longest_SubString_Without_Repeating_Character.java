package Strings.Medium;

import java.util.Arrays;

public class Longest_SubString_Without_Repeating_Character {

    static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[26];
        int ans = 0;
        int c = 0;
        for(char ch : s.toCharArray()){
            int ind = (int) ch - 'a';
            if(freq[ind] == 0){
                c++;
                freq[ind]++;
            }
            else{
                ans = Math.max(c,ans);
                c = 0;
                Arrays.fill(freq,0);
            }
        }
        return Math.max(ans,c);
    }
}
