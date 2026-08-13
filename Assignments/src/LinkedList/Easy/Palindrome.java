package LinkedList.Easy;

import LinkedList.ListNode;

import static LinkedList.Easy.Middle_of_LL.middleNode;
import static LinkedList.Easy.Reverse_LL.reverseList;

public class Palindrome {
    // LeetCode:

    /*

     */

    static void main(String[] args) {
        ListNode list = new ListNode();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        System.out.println(isPalindrome(list.head));
    }
    static public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;
        // compare both the halves
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return head == null || headSecond == null;
    }
}
