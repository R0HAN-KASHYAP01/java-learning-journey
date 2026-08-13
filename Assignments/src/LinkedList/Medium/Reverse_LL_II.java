package LinkedList.Medium;

import LinkedList.ListNode;

public class Reverse_LL_II {

//    LeetCode: 92. Reverse Linked List II

    /*
    Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.



Example 1:
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]

Example 2:
Input: head = [5], left = 1, right = 1
Output: [5]


Constraints:
The number of nodes in the list is n.
1 <= n <= 500
-500 <= Node.val <= 500
1 <= left <= right <= n


Follow up: Could you do it in one pass?
     */

    static void main(String[] args) {
        ListNode list = new ListNode();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        int left = 2;
        int right = 4;
        System.out.print("Before Reverse: ");
        list.display();
        list.head = reverseBetween(list.head,left,right);
        System.out.print("After Reverse: ");
        list.display();
    }
    static public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        ListNode current = head;
        ListNode prev = null;

        for(int i = 0; current != null && i < left-1; i++){
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        ListNode next = current.next;
        for(int i = 0; current != null && i < right - left +1; i++){
            current.next = prev;
            prev = current;
            current = next;

            if(next != null) next = next.next;
        }

        if(last != null){
            last.next = prev;

        }else head = prev;
        newEnd.next = current;
        return head;
    }
}
