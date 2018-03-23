package linkedlist;

import java.util.Stack;

/**
 * Created by Shikha on 23/03/18.
 * Given a singly linked list, determine if it is a palindrome.
 */
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if(head==null)
            return true;

        ListNode temp =head;
        Stack<ListNode> stack = new Stack<>();
        while(temp!=null){
            stack.push(temp);
            temp= temp.next;
        }

        temp =head;
        while(temp!=null){
            if(stack.peek().val!=temp.val){
                break;
            }
            stack.pop();
            temp= temp.next;

        }

        return stack.isEmpty();
    }

    public static void main(String[] args){
        ListNode head =ListNode.constructList();
        ListNode.displayList(head);
        System.out.println("\n"+ isPalindrome(head));
    }
}
