package LinkedList;

public class ListNode {
    public int val;
    public ListNode head;
    public ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void insertFirst(int val){
          ListNode node = new ListNode(val);
          if(head == null){
              head = node;
              return;
          }
          node.next = head;
          head = node;
    }

    public void insertLast(int val){
          ListNode node = new ListNode(val);
          if(head == null){
              insertFirst(val);
              return;
          }
          ListNode temp = head;
          while(temp.next != null){
              temp = temp.next;
          }
          temp.next = node;
    }

    public void display(){
          ListNode temp = head;
          if(head == null){
              System.out.println("Linked list is empty");
              return;
          }
          while(temp != null){
              System.out.print(temp.val + " -> ");
              temp = temp.next;
          }
        System.out.println("END");

    }

    public void display2(ListNode head){
        ListNode temp = head;
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void Create_Cycle(int s,int e){
        ListNode start = head;
        ListNode end = head;
        while(s > 1){
            start = start.next;
            s--;
        }
        while(e > 1){
            end = end.next;
            e--;
        }
        end.next = start;
    }

    public ListNode join(ListNode first, ListNode second){
          ListNode temp = first;
          while(temp.next != null){
              temp = temp.next;
          }
          temp.next = second;
          return first;
    }

    public ListNode getNode(int val){
          ListNode temp = head;
          while(temp != null){
              if(temp.val == val) return temp;
              temp = temp.next;
          }
          return temp;
    }
}
