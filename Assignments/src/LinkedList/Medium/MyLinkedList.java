package LinkedList.Medium;

import LinkedList.ListNode;

public class MyLinkedList {
    public int val;
    public MyLinkedList next;
    public MyLinkedList head;
    public MyLinkedList() {

        }
        MyLinkedList(int val){
        this.val = val;

    }

    public int get(int index) {
        int c = 0;
        MyLinkedList temp = head;
        while(c != index &&  temp != null){
            temp = temp.next;
            c++;
        }
        if(temp == null) return -1;
        return temp.val;
    }

    public void addAtHead(int val) {
        MyLinkedList temp = new MyLinkedList(val);
        temp.next = head;
        head = temp;

    }

    public void addAtTail(int val) {
        MyLinkedList node = new MyLinkedList(val);
        MyLinkedList temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
    }

    public void addAtIndex(int index, int val) {
        MyLinkedList node = new MyLinkedList(val);
        MyLinkedList temp = head;
        while (index > 1 && temp != null){
            temp = temp.next;
            index--;

        }
        if(temp != null){
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void deleteAtIndex(int index) {
        MyLinkedList temp = head;
        while(index > 1 && temp != null){
            temp = temp.next;
            index--;
        }
        if(temp != null){
            temp.next = temp.next.next;
        }
    }
}
