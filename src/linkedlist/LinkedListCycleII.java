package linkedlist;

import java.util.List;

/**
 * Created by Shikha on 16/03/18.
 * Given a linked list, return the node where the cycle begins.
 * If there is no cycle, return null.
 * Note: Do not modify the linked list.
 */
public class LinkedListCycleII {
    public static ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;
        ListNode fast =head;
        ListNode slow =head;

        while (fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast){
                ListNode temp = head;
                while (temp != null) {
                    if (temp == slow)
                        return temp;
                    temp = temp.next;
                    slow = slow.next;
                };
            }

        }

        return null;

    }

    public static void main(String[] args){
        ListNode head = ListNode.constructList();
        System.out.print("\nOriginal List:");
        ListNode.displayList(head);
        detectCycle(head);
    }
}
