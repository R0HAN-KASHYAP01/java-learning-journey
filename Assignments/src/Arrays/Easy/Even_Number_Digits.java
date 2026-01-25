package Arrays;

import java.util.Scanner;

public class Even_Number_Digits {
//    Leet Code: 1295. Find Numbers with Even Number of Digits

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i< size; i++){
            nums[i] = input.nextInt();
        }
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(digits(num) % 2 == 0){
                count++;
            }

        }
        return count;
    }

    static public int digits(int num){
        if(num ==0){
            return 1;
        }
        int ans = (int) (Math.log10(num))+ 1;
        return ans;

    }
}
