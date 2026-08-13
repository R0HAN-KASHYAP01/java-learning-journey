package Strings.Medium;

public class Number_of_SubString_only_1s {

    static void main(String[] args) {
        System.out.println(numSub("0110111"));
    }
    static public int numSub(String s) {
        int total_one = 0;
        int ans = 0;
        String text = "1";
        for(char c : s.toCharArray()){
            if(c == '1') total_one++;
        }
        for(int i = 1; i <= total_one; i++){
            String check = text.repeat(i);
            int j = 0;
            while(j + i-1 < s.length()){
                String temp = s.substring(j,j+i);
                if(temp.equals(check)) ans++;
                j++;
            }

        }
        return ans;
    }
}
