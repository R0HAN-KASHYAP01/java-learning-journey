package Sorting.Easy;

import java.util.Arrays;

public class Relative_sort_Array {

    static void main(String[] args) {
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
   static public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        for(int i =0; i<arr1.length;i++){
            freq[arr1[i]]++;
        }
        int k = 0;
        int i =0;
        while(i < arr1.length && k < arr2.length){
            if(freq[arr2[k]] == 0){
                k++;
            }
            else{
                arr1[i] = arr2[k];
                i++;
                freq[arr2[k]]--;
            }

        }
        return arr1;
    }
}
