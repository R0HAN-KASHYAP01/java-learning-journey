package Strings.Medium;

public class Repeated_String_Match {

    static void main(String[] args) {
        String a = "abc";
        String b = "cabcabca";
        System.out.println(repeatedStringMatch(a,b));
    }
    static public int repeatedStringMatch(String a, String b) {
        int count = 1;
        String temp = a;
        while(a.length() < 10001){
            if(a.contains(b)){
                return count;
            }
            a += temp;
            count++;
        }

        return -1;
    }
}
