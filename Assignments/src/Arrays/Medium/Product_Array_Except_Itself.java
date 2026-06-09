package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class Product_Array_Except_Itself {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i<n; i++){
            num[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(productExceptSelf2(num)));
    }


//    Method 1: Time -> O(n) and Space -> O(n) excluding the result
    static public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        int[] pre = new int[size];
        int[] suf = new int[size];
        int preMul = 1;
        int sufMul = 1;

        for(int i = 0; i<size; i++){
            pre[i] = preMul;
            preMul *= nums[i];
        }
        for(int i = size-1; i>= 0; i--){
            suf[i] = sufMul;
            sufMul *= nums[i];
        }

        for(int i = 0; i<size; i++){
            result[i] = pre[i] * suf[i];
        }
        return result;


    }



//    Method 2: Time -> O(n) and Space -> O(1) excluding the result
static public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for(int i = 1; i<n; i++){
            result[i] = result[i-1] * nums[i-1];
        }

        int suffix = 1;
        for(int i = n-1; i>= 0; i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
}


}
