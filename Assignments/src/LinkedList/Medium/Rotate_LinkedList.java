package LinkedList.Medium;

import LinkedList.ListNode;

public class Rotate_LinkedList {
//    LeetCode: 61. Rotate List

    /*
    Given the head of a linked list, rotate the list to the right by k places.



Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Example 2:
Input: head = [0,1,2], k = 4
Output: [2,0,1]


Constraints:
The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
     */

    static void main(String[] args) {
        ListNode list = new ListNode();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        int k = 2;
        list.head = rotateRight(list.head,k);
        list.display();
    }
    static public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int size = getLength(head);

        k %= size;

        if (k == 0) {
            return head;
        }

        ListNode temp = head;
        ListNode newEnd = head;

        int count = 0;

        while (temp.next != null) {
            if (count == size - k - 1) {
                newEnd = temp;
            }
            temp = temp.next;
            count++;
        }

        temp.next = head;
        head = newEnd.next;
        newEnd.next = null;

        return head;
    }

    static public int getLength(ListNode head) {
        int len = 0;

        while (head != null) {
            len++;
            head = head.next;
        }

        return len;
    }
}
