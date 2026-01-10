package Day5_LinearSearch;

import java.util.Scanner;

public class Even_number_Digits {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];
        for (int i = 0; i<5; i++){
            nums[i] = input.nextInt();
        }
        int result = findNumber(nums);
        System.out.println("Number of elements that contain even number of digits");
        System.out.println(result);


    }

    static  public  int findNumber(int[] nums){
        if(nums.length == 0){
            return -1;
        }
        int ans = 0;
        for (int element : nums){
            if (number_digit(element) % 2 == 0){
                ans++;
            }
        }
        return ans;

    }

    static public int number_digit(int num){
        int ans = 0;
        while(num > 0){
            num /= 10;
            ans++;
        }
        return ans;
    }
}
