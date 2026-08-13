package LinkedList.Easy;

import LinkedList.ListNode;

public class Merger_Sorted_LL {
//    LeetCode: 21. Merge Two Sorted Lists

    /*
    You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.


Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]


Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
     */

    static void main(String[] args) {
        ListNode list1 = new ListNode();
        list1.insertFirst(1);
        list1.insertLast(2);
        list1.insertLast(4);
        System.out.println("List 1: ");
        list1.display();
        ListNode list2 = new ListNode();
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);
        System.out.println("List 2: ");
        list2.display();

        ListNode merge = new ListNode();
        merge.head = mergeTwoLists(list1.head,list2.head);
        System.out.println("After merge: ");
        merge.display();
    }
    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            }

            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if(list1 != null){
            tail.next = list1;
        }
        else{
            tail.next = list2;
        }
        return dummyHead.next;
    }
}
