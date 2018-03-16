package linkedlist;

/**
 * Created by Shikha on 16/03/18.
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * Supposed the linked list is 1 -> 2 -> 3 -> 4
 * and you are given the third node with value 3,
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class DeleteNodeinaLinkedList {
    public static void deleteNode(ListNode node) {
        if(node!=null && node.next!=null){
            ListNode nextNode = node.next;
            node.val= nextNode.val;
            node.next=nextNode.next;
            nextNode=null;
        }

    }

    public static void main(String[] args){
        ListNode head = ListNode.constructList();
        System.out.print("\nOriginal List:");
        ListNode.displayList(head);
        deleteNode(head.next.next);
        System.out.print("\nList After deletion :");
        ListNode.displayList(head);
    }


}
