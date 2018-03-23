package linkedlist;

import java.util.List;

/**
 * Created by Shikha on 23/03/18.
 * Given a linked list, remove the nth node from the end of list and return its head.
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * Given n will always be valid.
 Try to do this in one pass.
 */
public class RemoveNthNodeFromEndofList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode fast= dummyHead;
        ListNode slow= dummyHead;

        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }

        while(fast!=null){
            fast= fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;

        return dummyHead.next;
    }

    public static void main(String[] args){
        ListNode head = ListNode.constructList();
        ListNode.displayList(head);
        head = removeNthFromEnd(head,6);
        System.out.println();
        ListNode.displayList(head);
    }
}
