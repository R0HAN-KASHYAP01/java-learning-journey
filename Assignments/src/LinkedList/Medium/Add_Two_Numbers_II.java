package LinkedList.Medium;

import LinkedList.ListNode;

public class Add_Two_Numbers_II {
//    LeetCode: 445. Add Two Numbers II
    /*
    You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.



Example 1:


Input: l1 = [7,2,4,3], l2 = [5,6,4]
Output: [7,8,0,7]
Example 2:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [8,0,7]
Example 3:

Input: l1 = [0], l2 = [0]
Output: [0]


Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.


Follow up: Could you solve it without reversing the input lists?
     */

    static void main(String[] args) {
        ListNode list = new ListNode();
        list.insertLast(7);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(3);

        list.display();
        ListNode list2 = new ListNode();
        list2.insertLast(5);
        list2.insertLast(6);
        list2.insertLast(4);
        list2.display();
        System.out.println("After Sum: ");
        ListNode ans = new ListNode();
        ans.head = addTwoNumbers(list.head,list2.head);
        ans.display();
    }
    static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode Ori1 = reverse(l1);
        ListNode Ori2 = reverse(l2);
        ListNode t1 = Ori1;
        ListNode t2 = Ori2;
        ListNode DummyHead = null;
        int sum = 0;
        int c = 0;
        while(t1 != null || t2 != null || c != 0){
            int x = (t1 != null) ? t1.val : 0;
            int y = (t2 != null) ? t2.val : 0;

            sum = c + x + y;
            ListNode node = new ListNode(sum % 10);
            node.next = DummyHead;
            DummyHead = node;
            c = sum / 10;
            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;

        }
        reverse(Ori1);
        reverse(Ori2);
        return DummyHead;
    }

    static public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
