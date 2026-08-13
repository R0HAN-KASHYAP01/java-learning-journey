package Recursion.Easy;

public class First_UpperCase_Letter {
    // GFG:
    /*
    Given a string find its first uppercase letter
Examples :

Input : geeksforgeeKs
Output : K

Input  : geekS
Output : S
     */

    static void main(String[] args) {
        String str = "geeksforgeeKs";
        System.out.println(First_Upper(str,0));
    }
    static char First_Upper(String str,int ind){
        if(ind == str.length()-1){
            return '1';
        }
        if(str.charAt(ind) >= 'A' && str.charAt(ind) <= 'Z'){
            return str.charAt(ind);
        }
        return First_Upper(str,ind+1);
    }
}
