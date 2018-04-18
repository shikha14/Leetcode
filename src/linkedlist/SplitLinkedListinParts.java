package linkedlist;

import java.util.Arrays;

/**
 * Created by Shikha on 18/04/18.
 * Given a (singly) linked list with head node root, write a function to split the linked list into k consecutive linked list "parts".

 The length of each part should be as equal as possible: no two parts should have a size differing by more than 1. This may lead to some parts being null.

 The parts should be in order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal parts occurring later.

 Return a List of ListNode's representing the linked list parts that are formed.

 Examples 1->2->3->4, k = 5 // 5 equal parts [ [1], [2], [3], [4], null ]
 Example 1:
 Input:
 root = [1, 2, 3], k = 5
 Output: [[1],[2],[3],[],[]]
 Explanation:
 The input and each element of the output are ListNodes, not arrays.
 For example, the input root has root.val = 1, root.next.val = 2, \root.next.next.val = 3, and root.next.next.next = null.
 The first element output[0] has output[0].val = 1, output[0].next = null.
 The last element output[4] is null, but it's string representation as a ListNode is [].
 Example 2:
 Input:
 root = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 3
 Output: [[1, 2, 3, 4], [5, 6, 7], [8, 9, 10]]
 Explanation:
 The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.
 Note:

 The length of root will be in the range [0, 1000].
 Each value of a node in the input will be an integer in the range [0, 999].
 k will be an integer in the range [1, 50].
 */
public class SplitLinkedListinParts {
    public static ListNode[] splitListToParts(ListNode root, int k) {
        int listSize= size(root);
        ListNode current = root;
        ListNode[] resultList=new ListNode[k];
        if(listSize==0)
            return resultList;
        int listWidth = 1;
        int remainder =0;

        if(listSize>k){
            remainder=listSize%k;
        }
        for(int i=0;i<k;i++){
            listWidth= listSize/k;
            if(remainder!=0){
                listWidth+=1;
                remainder--;
            }
            ListNode newHead= current;
            for(int index=1;index<listWidth;index++){
                if(current!=null)
                    current=current.next;
            }
            if(current!=null){
                ListNode newLast= current;
                current=current.next;
                newLast.next=null;

            }
            resultList[i]=newHead;

        }

        return resultList;
    }

    public static int size(ListNode root){
        ListNode temp = root;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        return count;
    }

    public static void main(String[] args){
        ListNode head = ListNode.constructList();
        System.out.print("\nOriginal List:");
        ListNode.displayList(head);
        System.out.println("Size::"+size(null));
        System.out.println(Arrays.toString(splitListToParts(head,6)));

    }
}
