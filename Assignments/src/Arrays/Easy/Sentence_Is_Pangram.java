package Arrays.Easy;

import java.util.HashMap;

public class Sentence_Is_Pangram {
    static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        for(int i = 0; i<26; i++){
            System.out.println((char) ('a'+i));
        }
//        checkIfPangram(sentence);
    }
    static public boolean checkIfPangram(String sentence) {
        int len = sentence.length();
        HashMap<Character,Integer> map = new HashMap<>();
        if(len < 26){
            return false;
        }
        for(int i = 0; i<len; i++){
            if(!map.containsKey(sentence.charAt(i))){
                map.put(sentence.charAt(i),1);
            }
        }
        for(int i = 0; i<len; i++){
            if(!map.containsKey("a" + i)){
                System.out.println("a" + i);
                return false;
            }
        }
        return true;

    }
}
