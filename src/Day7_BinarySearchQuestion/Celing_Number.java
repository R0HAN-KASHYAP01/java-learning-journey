package Day7_BinarySearchQuestion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Celing_Number {
    static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.println("Enter the element of the array: ");
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = input.nextInt();
        int ans = celing(arr,target);
        System.out.println(ans);
    }
    static public int celing(int[] nums,int target){

        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high -low)/2;
            if(nums[mid] == target){
                return nums[mid];
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return nums[low];
    }
}
