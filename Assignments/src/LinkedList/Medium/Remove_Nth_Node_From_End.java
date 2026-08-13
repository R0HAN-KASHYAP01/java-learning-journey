package LinkedList.Medium;

import LinkedList.ListNode;

public class Remove_Nth_Node_From_End {
//    LeetCode: 19. Remove Nth Node From End of List

    /*
    Given the head of a linked list, remove the nth node from the end of the list and return its head.



Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]


Constraints:
The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz


Follow up: Could you do this in one pass?
     */

    static void main(String[] args) {
        ListNode list = new ListNode();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
//        removeNthFromEnd(list.head,2);
        removeNThFromENd(list.head,2);
        list.display();
    }


//    Method 1:
    static public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getLength(head);
        if(head == null || n > size ) return head;
        int pos = size-n;
        if(pos == 0){
            head = head.next;
            return head;
        }
        ListNode temp = head;
        while(pos > 1){
            temp = temp.next;
            pos--;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        return head;
    }
    static public int getLength(ListNode head){
        ListNode temp = head;
        int c = 0;
        while(temp != null){
            temp = temp.next;
            c++;

        }
        return c;
    }

//    Method 2:
    static public ListNode removeNThFromENd(ListNode head,int n){

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the node
        slow.next = slow.next.next;

        return dummy.next;

    }
}
