package Stack_Queue.Medium;

import java.util.Arrays;
import java.util.Stack;

public class Most_Competitive_SubSequence {

    static void main(String[] args) {
        int[] nums = {2,4,3,3,5,4,9,6};
        int k = 4;
        System.out.println(Arrays.toString(mostCompetitive(nums,k)));
    }

    static  public int[] mostCompetitive(int[] nums, int k) {
        class Solution {
            public int[] mostCompetitive(int[] nums, int k) {
                Stack<Integer> stack = new Stack<>();

                for (int i = 0; i < nums.length; i++) {

                    while (!stack.isEmpty()
                            && stack.peek() > nums[i]
                            && stack.size() - 1 + (nums.length - i) >= k) {

                        stack.pop();
                    }

                    if (stack.size() < k) {
                        stack.push(nums[i]);
                    }
                }

                int[] ans = new int[k];

                for (int i = k - 1; i >= 0; i--) {
                    ans[i] = stack.pop();
                }

                return ans;
            }
        }
    }
}
