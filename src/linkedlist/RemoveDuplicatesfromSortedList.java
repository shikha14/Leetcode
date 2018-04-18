package linkedlist;

/**
 * Created by Shikha on 19/04/18.
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 *
 * Given 1->1->2, return 1->2.
 *
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesfromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while (temp!=null && temp.next!=null){
            ListNode current=temp.next;
            while (current!=null && temp.val==current.val){
                current=current.next;
            }
            temp.next=current;
            temp=temp.next;
        }

        return head;
    }

    public static void main(String[] args){
        ListNode head = ListNode.constructList();
        ListNode.displayList(deleteDuplicates(head));
    }
}
