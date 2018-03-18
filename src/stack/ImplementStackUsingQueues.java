package stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Shikha on 18/03/18.
 * Implement the following operations of a stack using queues.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * Notes:
 * You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
 * Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
 * You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 */
public class ImplementStackUsingQueues {
    Queue queue1;
    Queue queue2;


    /** Initialize your data structure here. */
    public ImplementStackUsingQueues() {
        queue1 =new LinkedList();
        queue2 =new LinkedList();

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue2.add(x);

        while (!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.remove();
        }

        Queue temp = queue1;
        queue1=queue2;
        queue2=temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() throws Exception {
        if(queue1.isEmpty())
            throw new Exception("Stack empty!!");

        int popedElement = (int) queue1.peek();
        queue1.remove();

        return popedElement;
    }

    /** Get the top element. */
    public int top() {
        if(empty())
            return -1;
        return (int) queue1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String args[]) throws Exception {
        ImplementStackUsingQueues obj = new ImplementStackUsingQueues();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.empty());


    }
}
