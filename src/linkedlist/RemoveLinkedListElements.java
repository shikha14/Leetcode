package linkedlist;

/**
 * Created by Shikha on 16/03/18.
 * Remove all elements from a linked list of integers that have value val.
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next=head;
        ListNode temp = head;
        ListNode prev = dummyHead;

        while (temp!=null){
            if(temp.val==val){
                prev.next=temp.next;
            }else{
                prev=temp;
            }
            temp= temp.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args){
        ListNode head = ListNode.constructList();
        ListNode.displayList(head);
        System.out.println();
        head = removeElements(head,1);
        ListNode.displayList(head);
    }
}
