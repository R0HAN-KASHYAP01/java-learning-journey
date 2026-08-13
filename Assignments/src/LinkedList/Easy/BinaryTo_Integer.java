package LinkedList.Easy;

import LinkedList.ListNode;

public class BinaryTo_Integer {
//    LeetCode: 1290. Convert Binary Number in a Linked List to Integer

    /*
    Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.



Example 1:
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

Example 2:
Input: head = [0]
Output: 0


Constraints:
The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.
     */

    static void main(String[] args) {
        ListNode list = new ListNode();
        list.insertLast(1);
        list.insertLast(0);
        list.insertLast(1);
        int ans = getDecimalValue(list.head);
        System.out.println(ans);

    }
    static public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        StringBuilder str = new StringBuilder();
        while(temp != null){
            str.append(temp.val);
            temp = temp.next;
        }
        String binaryString = str.toString();
        int decimal = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            // Shift total left by 1 and add the current bit value (0 or 1)
            decimal = (decimal << 1) + (binaryString.charAt(i) - '0');
        }
        return decimal;
    }
}
