package stack;

import java.util.Stack;

/**
 * Created by Shikha on 18/03/18.
 */
public class MinStack {
    Stack originalStack;
    Stack minStack;

    public MinStack() {
        originalStack = new Stack();
        minStack = new Stack();
    }

    public void push(int x) {
        originalStack.push(x);
        if(minStack.isEmpty())
            minStack.push(x);
        else
        {
            int currentMin = (int) minStack.peek();
            if(currentMin>=x){
                minStack.push(x);
            }
        }

    }

    public void pop() throws Exception {
        if(!originalStack.isEmpty()) {
            int removedElement = (int) originalStack.pop();
            if (!minStack.isEmpty()){
                if(removedElement==getMin()){
                    minStack.pop();
                }
            }
        }
    }

    public int top() throws Exception {
        if(minStack.isEmpty())
            throw new Exception("Stack Underflow!!");
        return (int) originalStack.peek();
    }

    public int getMin() throws Exception {
        if(minStack.isEmpty())
            throw new Exception("Stack Underflow!!");
        return (int) minStack.peek();
    }


    public static void main(String args[]) throws Exception {
        MinStack obj = new MinStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(1);

        System.out.println(obj.top());
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());

    }
}
