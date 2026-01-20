package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class N_unique_number {

//    LeetCode : 1304. Find N Unique Integers Sum up to Zero

    /*
    Given an integer n, return any array containing n unique integers such that they add up to 0.



Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();

        int[] ans = sumZero(n);
        System.out.println("Array with Unique Number of sum 0.");
        System.out.println(Arrays.toString(ans));

    }
    static public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n == 1){
            return new int[] {0};
        }
        int start = 0;
        int end = n-1;

        while(start < end){
            ans[start] = -n;
            ans[end] = n;
            start++;
            end--;
            n++;
        }


        return ans;
    }
}
