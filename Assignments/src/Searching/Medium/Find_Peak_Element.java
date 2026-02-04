package Searching.Medium;

public class Find_Peak_Element {
    static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
    static public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        if(end == 0){
            return 0;
        }
        int ans = 0;
        while(start < end){
            int mid = start + (end-start)/2;
            if(mid == start){
                if(nums[mid] == nums[mid+1]+1){
                    if(nums[mid] > nums[ans]){
                        ans = mid;
                    }
                    start = mid+1;
                }
                else if(nums[mid] > nums[mid]+1){
                    start = mid;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(nums[mid] == nums[mid-1]+1){
                    if(nums[mid] > nums[ans]){
                        ans = mid;
                    }
                    start = mid+1;
                }
                else if(nums[mid] > nums[mid]+1){
                    start = mid;
                }
                else{
                    end = mid-1;
                }
            }


        }
        return ans;
    }
}
