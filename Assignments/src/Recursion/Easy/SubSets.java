package Recursion.Easy;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subSet(arr);
        for (List<Integer> l : ans){
            System.out.println(l);
        System.out.println(titleToNumber("AB"));
        }
    }
    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr){
            int n = outer.size();
            for (int i = 0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    static int titleToNumber(String columnTitle) {
        int sum = 0;

        for(int i = columnTitle.length()-1;i>= 0; i--){
            int c = (columnTitle.length()-1-i) * 26;
            int p = (int) (columnTitle.charAt(i) - 'A') + 1;
            sum = c > 0 ? (c * p) + sum : p + sum;
        }
        return sum;
    }


}
