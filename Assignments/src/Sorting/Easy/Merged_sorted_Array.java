package Sorting.Easy;

import java.util.Arrays;

public class Merged_sorted_Array {
    static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while(j < nums2.length){
            if(nums1[i] < nums2[j] && i <nums1.length-1 && nums1[i] != 0){
                i++;
            }
            else{
                for(int k = m-1; k>=i-1; k--){
                    nums1[k+1] = nums1[k];
                }
                j++;
                m++;
            }
        }
    }
}
