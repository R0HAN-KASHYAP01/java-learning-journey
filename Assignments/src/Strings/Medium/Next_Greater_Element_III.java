package Strings.Medium;

public class Next_Greater_Element_III {

    static void main(String[] args) {
        System.out.println(nextGreaterElement(11));
    }
    static public int nextGreaterElement(int n) {
        if(n <= 10) return -1;
        StringBuilder s = new StringBuilder();
        s.append(n);
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;
        int j = s.length()-2;
        while(j>=0 && s.charAt(i) == s.charAt(j)){
            i--;
            j--;
            ans.append(s.charAt(i));

        }
        if(j < 0) return  -1;
        if( j >= 0 && s.charAt(i) > s.charAt(j) ){
            ans.append(s.charAt(j));
            ans.append(s.charAt(i));
        }
        else{
            while(j >= 0 && s.charAt(j) < s.charAt(i)){
                j--;
            }
            char temp = s.charAt(i);
            ans.append(s.charAt(j));
            i--;
            while( j >= 0 && i > j){
                ans.append(s.charAt(i));
                i--;
            }
            ans.append(temp);
        }
        j--;
        while(j >= 0){
            ans.append(s.charAt(j));
            j--;
        }
        int result = Integer.parseInt(ans.reverse().toString());
        if(result > n) return result;
        return -1;
    }
}
