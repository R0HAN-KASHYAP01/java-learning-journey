package LinkedList.Easy;

import LinkedList.ListNode;

public class Remove_LL_Elements {
//    LeetCode: 203. Remove Linked List Elements

    /*
    Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.



Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Example 2:
Input: head = [], val = 1
Output: []

Example 3:
Input: head = [7,7,7,7], val = 7
Output: []


Constraints:
The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50
     */

    static void main(String[] args) {
        ListNode list = new ListNode();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(6);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        int val = 6;
        System.out.print("Before Deleting elements: ");
        list.display();
        list.head = removeElements(list.head,val);
        System.out.print("After Deleting elements: ");
        list.display();
    }
    static public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        while(head != null && head.val == val) head = head.next;
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            if(current.val == val){
                current = current.next;
                prev.next = current;
            }
            else{
                prev = current;
                current = current.next;
            }
        }
        return head;

    }
}
