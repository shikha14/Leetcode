package linkedlist;

/**
 * Created by Shikha on 23/03/18.
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * For example, the following two linked lists:
 *
 * A:          a1 → a2
                        ↘
                            c1 → c2 → c3
                        ↗
 * B:      b1 → b2 → b3
 *
 * begin to intersect at node c1.
 *
 * Notes:

 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class IntersectionofTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
            return null;

        int listASize = getListSize(headA);
        int listBSize = getListSize(headB);

        ListNode tempA= headA;
        ListNode tempB= headB;

        if(listASize>listBSize){
            int diff = listASize-listBSize;
            while(diff!=0){
                tempA= tempA.next;
                diff--;
            }
        }else if(listBSize>listASize){
            int diff = listBSize-listASize;
            while(diff!=0){
                tempB= tempB.next;
                diff--;
            }
        }

        while (tempA!= null && tempB!=null){
            if(tempA==tempB)
                return tempA;

            tempA= tempA.next;
            tempB=tempB.next;

        }

        return null;
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

    public static void main(String[] args){
        ListNode node = new ListNode(10);
        node.next= new ListNode(11);
        node.next.next= new ListNode(12);


        ListNode headA =new ListNode(1);
        headA.next =new ListNode(2);
        headA.next.next =new ListNode(3);
        headA.next.next.next =node;


//        ListNode headB =new ListNode(5);
//        headB.next =new ListNode(6);
//        headB.next.next =node;

        ListNode headB =null;


        System.out.println(getIntersectionNode(headA,headB));

    }
}
