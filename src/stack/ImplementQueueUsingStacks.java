package stack;

import java.util.Stack;

/**
 * Created by Shikha on 18/03/18.
 * Implement the following operations of a queue using stacks.
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 empty() -- Return whether the queue is empty.
 Notes:
 You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
 Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
 You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 */
public class ImplementQueueUsingStacks {
    Stack stack1;
    Stack stack2;

    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks() {
        stack1= new Stack();
        stack2= new Stack();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack2.isEmpty()){
            transferItemsToSecondStack();
        }
        return (int) stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(stack2.isEmpty()){
            transferItemsToSecondStack();
        }
        return (int) stack2.peek();
    }

    private void transferItemsToSecondStack() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
         return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String args[]) throws Exception {
        ImplementQueueUsingStacks obj = new ImplementQueueUsingStacks();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.empty());


    }
}
