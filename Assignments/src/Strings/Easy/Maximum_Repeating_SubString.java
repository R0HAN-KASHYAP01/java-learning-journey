package Strings.Easy;

public class Maximum_Repeating_SubString {

    static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println(maxRepeating(sequence,word));
    }
    static public int maxRepeating(String sequence, String word) {
        int i = 0;
        int j = 0;
        int count = 0;
        int w = word.length();
        while(i < sequence.length()){
            if(j < w && sequence.charAt(i) == word.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j == w) count++;
                else i++;
                j = 0;
            }
        }
        return count;
    }
}
