package Searching.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Search_Insert_Position {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the value of target: ");
        int target = input.nextInt();
        System.out.println("The index of numbers are: ");
        System.out.println(searchInsert(arr,target));
    }
    static public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        if(nums[end] < target){
            return end+1;
        }
        while(start< end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }

        return end;
    }
}
