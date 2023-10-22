public class Main {
    public static void main(String[] args) {
//        removeLinkedListEle
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3))));
        int val = 6;
        printLinkedList(removeLinkedListEle(l1, val));

        ListNode l2 = new ListNode(6, new ListNode(6, new ListNode(6, new ListNode(6))));
        printLinkedList(removeLinkedListEle(l2, val));

    }
//helper: print data structures
    private static void printLinkedList(ListNode head) {
        ListNode curr = head;

        //edge
        if (head == null) {
            System.out.println("null");
        }

        while (curr != null) {
            System.out.println(curr.val + "->");
            curr = curr.next;
        }
    }

//    203.Remove Linked List Elements
    /*
    1,2,1,3,4,5,6, val = 1
  d
                p
                  c
    while (pre.next != null && curr != null)
    if c.val == val:
        p.next = curr.next

    else:
        pre = curr;
    c = c.next;
     */
    private static ListNode removeLinkedListEle(ListNode head, int val) {
//        edge
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy, curr = head;

        while (pre.next != null && curr != null) {
            if (curr.val != val) {
                pre = curr;
            } else {
                pre.next = curr.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }


}

