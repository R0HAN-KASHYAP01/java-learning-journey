package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Rotated_Array {
//    LeetCode: 189. Rotate Array
static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n = input.nextInt();
    int[] num = new int[n];
    System.out.println("Enter the elements of array: ");
    for (int i = 0; i<n; i++){
        num[i] = input.nextInt();
    }
    System.out.println("Enter the number of rotations: ");
    int k = input.nextInt();
    rotate(num,k);
    System.out.println(Arrays.toString(num));
}
static  public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k %n;
    reverse(0,n-k-1,nums);
    reverse(n-k,n-1,nums);
    reverse(0,n-1,nums);

}
    static public void reverse(int start, int end, int[] nums){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
