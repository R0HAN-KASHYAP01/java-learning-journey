package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class Beautiful_Arrangement {

    static void main(String[] args) {
        int n = 2;
        int[] nums = new int[n];
        for(int i = 1; i <= n;i++){
            nums[i-1] = i;
        }
        System.out.println(perm(nums,new ArrayList<>(), new boolean[n]));
    }
    static public int perm(int[] nums, List<Integer> current, boolean[] used){
        if(current.size() == nums.length){
            System.out.println(current);
            return helper(current);
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            current.add(nums[i]);
            used[i] = true;
            count += perm(nums,current,used);
            current.remove(current.size()-1);
            used[i] = false;
        }
        return count;
    }
   static  public int helper(List<Integer> current){
        for(int i = 0; i<current.size(); i++){
            int n = current.get(i);
            if(n % (i+1) != 0 && (i+1) % n != 0) return 0;
        }
        return 1;
    }
}
