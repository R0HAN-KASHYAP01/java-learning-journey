package Searching.Medium;

import java.util.Arrays;

public class Find_Right_interval {
    static void main(String[] args) {
        int[][] intervals = {{3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }
    static public int[] findRightInterval(int[][] intervals) {

        int n = intervals.length;

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int min_value = 100000;
            int min_ind = i;
            for (int j = 0; j < n; j++) {
                int end = intervals[i][1];
                if (intervals[j][0] >= end && i != j && intervals[j][0] < min_value) {
                    min_value = intervals[j][0];
                    min_ind = i;
                }
            }
            if(min_value != 100000){
                result[i] = min_ind;
            }
            else{
                result[i] = -1;

            }
        }
        return result;
    }
}
