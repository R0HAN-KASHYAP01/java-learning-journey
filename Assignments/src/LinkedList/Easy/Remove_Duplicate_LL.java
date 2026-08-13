package LinkedList.Easy;

import LinkedList.ListNode;

public class Remove_Duplicate_LL {
//    LeetCode: 83. Remove Duplicates from Sorted List

    /*
    Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.



Example 1:
Input: head = [1,1,2]
Output: [1,2]


Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]


Constraints:
The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
     */

    static void main(String[] args) {
        ListNode list = new ListNode();
        list.insertFirst(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.display();
        System.out.println("After Removing duplicates: ");
        deleteDuplicates(list.head);
        list.display();

    }
    static public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        while(temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}

