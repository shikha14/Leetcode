package linkedlist;

/**
 * Created by Shikha on 23/03/18.
 * Given a list, rotate the list to the right by k places, where k is non-negative.


 Example:

 Given 1->2->3->4->5->NULL and k = 2,

 return 4->5->1->2->3->NULL.
 */
public class RotateList {
    public static ListNode rotateRightUsingTwoPointer(ListNode head, int k) {
        int listSize = getListSize(head);
        if(listSize==0 || k % listSize==0)
            return head;

        if(k >listSize){
            k= k % listSize;
        }

        ListNode dummyHead = new ListNode(0);
        dummyHead.next=head;

        ListNode fast = dummyHead;
        ListNode slow =dummyHead;

        for(int i=1;i<=k+1;i++){
            if(fast==null)
                break;
            fast = fast.next;
        }

        if(fast==null)
            return dummyHead.next;

        ListNode lastNode=null;
        while (fast!=null){
            lastNode= fast;
            fast = fast.next;
            slow= slow.next;
        }


        if(lastNode!=null) {
            lastNode.next = dummyHead.next;
            dummyHead.next = slow.next;
            slow.next= null;
        }
        return dummyHead.next;
    }

    static int getListSize(ListNode head){
        int count=0;
        if(head==null)
            return count;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }


    public static ListNode rotateRight(ListNode head, int k) {
        int listSize = getListSize(head);
        if(listSize==0 || k % listSize==0)
            return head;

        if(k >listSize){
            k= k % listSize;
        }

        int sizeForBeginning = listSize-k;

        ListNode temp =head;
        for(int i=1;i<sizeForBeginning;i++){
            temp = temp.next;
        }
        ListNode lastNode=temp;
        while (lastNode.next!=null){
            lastNode= lastNode.next;
        }

        lastNode.next = head;
        head = temp.next;
        temp.next= null;

        return head;
    }

    public static void main(String[] args){
        ListNode head = ListNode.constructList();
        ListNode.displayList(head);
        System.out.println();
        head=rotateRight(head,6);
        ListNode.displayList(head);

    }
}
