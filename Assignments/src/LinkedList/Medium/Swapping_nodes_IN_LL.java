package LinkedList.Medium;

import LinkedList.ListNode;

public class Swapping_nodes_IN_LL {
//    LeetCode: 1721. Swapping Nodes in a Linked List

    /*
    You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).



Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]

Example 2:
Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]


Constraints:
The number of nodes in the list is n.
1 <= k <= n <= 105
0 <= Node.val <= 100
     */

    static void main(String[] args) {
        ListNode list = new ListNode();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        System.out.println("Before Swapping: ");
        list.display();
        swapNodes(list.head,2);
        System.out.println("After Swapping: ");
        list.display();
    }
    static public ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;

        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        ListNode second = head;
        ListNode temp = first;

        while (temp.next != null) {
            temp = temp.next;
            second = second.next;
        }

        int val = first.val;
        first.val = second.val;
        second.val = val;

        return head;
    }
}
