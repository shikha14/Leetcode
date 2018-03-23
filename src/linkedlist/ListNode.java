package linkedlist;

/**
 * Created by Shikha on 16/03/18.
 */
public class ListNode {
    public int val;
    public  ListNode next;
    public  ListNode(int x) { val = x; }

    public static ListNode constructList() {
        ListNode head= new ListNode(1);
//        head.next=new ListNode(1);
        head.next= new ListNode(2);
        head.next.next= new ListNode(6);
        head.next.next.next= new ListNode(3);
        head.next.next.next.next= new ListNode(4);
        head.next.next.next.next.next= new ListNode(5);
        head.next.next.next.next.next.next= new ListNode(6);
        return head;
    }

    public static void displayList(ListNode head) {
       if(head!=null){
           ListNode temp = head;
           while (temp.next!=null){
               System.out.print(temp.val+" ->");
               temp=temp.next;
           }
           System.out.print(temp.val+"!!");
       }
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
