package Arrays;

import java.util.Arrays;

public class Plus_One {
    static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] res = plusOne(arr);
        System.out.println(Arrays.toString(res));

    }
    static public int[] plusOne(int[] digits) {
        int sum = 0;
        int size = 0;
        if(digits[0] == 9 && digits[digits.length-1] == 9){
            size = digits.length+1;
        }else{
            size = digits.length;
        }

        int[] result = new int[size];
        if(digits[0] == 9 && digits[digits.length-1] == 9){
            result[0] =1;
            for(int i = 1; i<size;i++){
                result[i] = 0;
            }
        }else{
            size = digits.length;
            int c =0;
            for(int i = size-1;i>=0;i--){
                if(digits[i] == 9){
                    result[i] = 0;
                    c = 1;
                }
                else{
                    result[i] = digits[i] + c+1;
                    c = 0;
                }
            }
        }

        return result;

    }
}
