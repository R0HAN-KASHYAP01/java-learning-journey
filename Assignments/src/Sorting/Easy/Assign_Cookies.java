package Sorting.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Assign_Cookies {
//    LeetCode : 455. Assign Cookies
    /*
    Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.



Example 1:
Input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.

Example 2:
Input: g = [1,2], s = [1,2,3]
Output: 2
Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
You have 3 cookies and their sizes are big enough to gratify all of the children,
You need to output 2.


Constraints:
1 <= g.length <= 3 * 104
0 <= s.length <= 3 * 104
1 <= g[i], s[j] <= 231 - 1


     */
static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of Greedy factor array: ");
    int g_size = input.nextInt();
    int[] g = new int[g_size];
    System.out.println("Enter the size of Cookie array: ");
    int s_size = input.nextInt();
    int[] s = new int[s_size];
    System.out.println("Enter the values of Greedy factor array: ");
    for(int i = 0; i<g_size;i++){
        g[i] = input.nextInt();
    }
    System.out.println("Enter the values of Cookie array: ");
    for(int i = 0; i<s_size;i++){
        s[i] = input.nextInt();
    }
    System.out.println("Result: "+findContentChildren(g,s));
}
    static public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int gSize = g.length;
        int sSize = s.length;
        int count = 0;
        while(i < gSize && j < sSize){
            if(g[i] <= s[j]){
                i++;
                j++;
                count++;

            }
            else{
                j++;
            }
        }

        return count;
    }
}
