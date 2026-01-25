package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Colors {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i<n; i++){
            num[i] = input.nextInt();
        }
        sortColors(num);
        System.out.println(Arrays.toString(num));
    }
    static public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }
            else if (nums[i] == 1){
                one++;
            }
            else{
                two++;
            }
        }
        for(int i = 0; i<zero; i++){
            nums[i] = 0;
        }
        for(int i = zero; i< zero+one; i++){
            nums[i] = 1;
        }
        for(int i = zero+one; i< zero+one+two; i++){
            nums[i] = 2;
        }
    }
}
