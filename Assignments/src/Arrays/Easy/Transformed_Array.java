package Arrays.Easy;

import java.util.Arrays;

public class Transformed_Array {

//    3379. Transformed Array
    static void main(String[] args) {
        int[] nums = {3,-2,1,1};
        System.out.println(Arrays.toString(constructTransformedArray(nums)));
    }
    static public int[] constructTransformedArray(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        for(int i = 0; i<size; i++){
            int curr = nums[i];
            int total_ind = i + curr;
            if(total_ind >= 0){
                result[i] = nums[total_ind % size];
            }
            else{
                while(total_ind <= 0){
                    total_ind += size;
                }
                result[i] = nums[total_ind % size];
            }
        }
        return result;
    }
}
