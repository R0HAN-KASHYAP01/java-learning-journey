package Recursion.Easy;

import java.util.ArrayList;

public class SubSequence {

    static void main(String[] args) {
//        System.out.println(subSeq2("","aab"));
        System.out.println(backtrack(0,"AAB"));
    }

    static void subSeq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p,up.substring(1));


    }

    static ArrayList<String> subSeq2(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> lst = new ArrayList<>();
            lst.add(p);
            return lst;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeq2(p+ch , up.substring(1));
        ArrayList<String> right = subSeq2(p, up.substring(1));
        left.addAll(right);

        return left;
    }


    static public int backtrack(int start,String tile){
        if(start == tile.length()){
            return 1;
        }
        int count = 0;
        for(int i = start; i<tile.length(); i++){
            if(i > start && tile.charAt(i) == tile.charAt(i-1)){
                continue;
            }
            count += backtrack(i+1,tile);
            count += backtrack(i+1,tile);
        }
        return count;
    }
}
