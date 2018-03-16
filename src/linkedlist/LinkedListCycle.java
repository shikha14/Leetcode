package linkedlist;

/**
 * Created by Shikha on 16/03/18.
 * Given a linked list, determine if it has a cycle in it.
 * Can you solve it without using extra space?
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode fast =head;
        ListNode slow =head;

        while (fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast)
                return true;
        }

        return false;
    }
}
