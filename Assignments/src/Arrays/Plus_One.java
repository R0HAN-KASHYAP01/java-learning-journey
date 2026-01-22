package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Plus_One {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<size; i++){
            nums[i] = input.nextInt();
        }
        int[] res = plusOne(nums);
        System.out.println(Arrays.toString(res));

    }
    static public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0; // if digit is 9
        }

        // If all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }




//    Long Method
//    static public int[] plusOne(int[] digits) {
//       int sum = 0;
//        int size = digits.length;
//        int sum2 = 1;
//        for(int i = 0; i<size;i++){
//            sum = sum* 10 + digits[i];
//            sum2 *= 10;
//        }
//        if(sum2-1 == sum){
//            size = digits.length+1;
//        }else{
//            size = digits.length;
//        }
//
//        int[] result = new int[size];
//        if(sum2-1 == sum){
//            result[0] =1;
//            for(int i = 1; i<size;i++){
//                result[i] = 0;
//            }
//        }else{
//            size = digits.length;
//            int c =1;
//            for(int i = size-1;i>=0;i--){
//                if(digits[i] == 9&& c == 1){
//                    result[i] = 0;
//                    c = 1;
//                }
//                else{
//                    if(i == size-1){
//
//                        result[i] = digits[i] + c;
//                    }
//                    else{
//
//                        result[i] = digits[i] + c;
//                    }
//                    c = 0;
//                }
//            }
//        }
//
//        return result;
//
//    }
    }
