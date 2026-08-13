package LinkedList.Medium;

import LinkedList.ListNode;

public class LinkedList_Cycle_II {
//    LeetCode: 142. Linked List Cycle II

    /*
    Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.



Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Example 2:
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.

Example 3:
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.


Constraints:
The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.


Follow up: Can you solve it using O(1) (i.e. constant) memory?
     */

    static void main(String[] args) {
        ListNode list = new ListNode();
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(0);
        list.insertLast(-4);
        list.Create_Cycle(2,4);
        System.out.println(detectCycle(list.head).val);
    }

    static public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                length = Cycle_Length(slow);
                break;
            }
        }
        ListNode f = head;
        ListNode s = head;
        if(length == 0) return null;
         while(length > 0){
             s = s.next;
             length--;
         }
         while(f != s){
             f = f.next;
             s = s.next;
         }
         return s;

    }

    private static int Cycle_Length(ListNode slow) {
        ListNode temp = slow;
        int count = 0;
        do {
            temp = temp.next;
            count++;
        } while(temp != slow);
        return count;
    }
}
