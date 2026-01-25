package Arrays;

public class Remove_Duplicate_From_Array {
    static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));

    }
    static public int removeDuplicates(int[] nums) {
        int size = nums.length;
        if(size <= 1){
            return size;
        }

        int i = 0;
        for(int j  = 1; j<size; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }

        }


        return i+1;

    }
}
