package Arrays.Easy;

import java.util.Scanner;

public class Moving_Chips_Same_Position_MinCost {
//    LeetCode : 1217. Minimum Cost to Move Chips to The Same Position
    /*
    We have n chips, where the position of the ith chip is position[i].
We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position.


Example 1:
Input: position = [1,2,3]
Output: 1
Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
Second step: Move the chip at position 2 to position 1 with cost = 1.
Total cost is 1.

Example 2:
Input: position = [2,2,2,3,3]
Output: 2
Explanation: We can move the two chips at position  3 to position 2. Each move has cost = 1. The total cost = 2.

Example 3:
Input: position = [1,1000000000]
Output: 1

Constraints:
1 <= position.length <= 100
1 <= position[i] <= 10^9
     */

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        System.out.println("Enter the element of the array: ");
        int[] position = new int[size];
        for (int i = 0; i<size; i++){
            position[i] = in.nextInt();
        }
        System.out.println("Minimum Cost is : "+ minCostToMoveChips(position) );
    }

    static public int minCostToMoveChips(int[] position) {
        int odd_count = 0;
        int even_count = 0;
        for(int chip : position){
            if(chip % 2 == 0) even_count++;
            else odd_count++;
        }
        return Math.min(odd_count, even_count);
    }
}

/*
Logic: Here we given,
position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.

Means , odd position chip can move free to odd position such as: 1->3->5->7 ...
similarly , even position chip can move free to even position such as: 0->2->4->6....

So, we only pay to move a chip of odd positon to even or vice-versa.
hence , we calculate the count of even position and odd position of the chip
then, we check which position chip has low in count


suppose , position = [1,2,3]
here , 1 chip are at even positon i.e. 2
and 2 chips are at odd position i.e. 1 and 3
so, we can either move all chips to 1 or 3, because it free to move chip1 to position 3 or vice-versa.
and we only have to pay for chip2 to move at either of the position 1 or 3.

Thus as answer , we have to return only the Math.min(odd_count, even_count).



 */
