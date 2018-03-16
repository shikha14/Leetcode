package linkedlist;

/**
 * Created by Shikha on 16/03/18.
 * Reverse a singly linked list.
 * Example
 * Given: 1 --> 2 --> 3 --> 4 --> 5
 * Return: 5 --> 4 --> 3 --> 2 --> 1
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if(head!=null) {
            ListNode prev = null;
            ListNode current = head;
            ListNode nextNode ;

            while (current!=null){
                nextNode = current.next;
                current.next=prev;
                prev =current;
                current=nextNode;
            }
            head = prev;
        }
        return head;
    }

    public static void main(String[] args){
        ListNode head = ListNode.constructList();
        System.out.print("\nOriginal List:");
        ListNode.displayList(head);
        head =reverseList(head);
        System.out.print("\nList After Reverse :");
        ListNode.displayList(head);
    }
}
