package tree;

import com.sun.source.tree.BinaryTree;

import java.time.temporal.Temporal;
import java.util.Stack;

/**
 * Created by Shikha on 19/03/18.
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * Calling next() will return the next smallest number in the BST.
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 */
public class BinarySearchTreeIterator {
    Stack<TreeNode> stack;
    public BinarySearchTreeIterator(TreeNode root) {
        stack=new Stack();
        if(root!=null){
            TreeNode temp = root;
            while (temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
        }

    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode temp = stack.pop();
        int val = temp.val;
        if(temp.right!=null){
            temp= temp.right;
            while (temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
        }

        return val;
    }

    public static void main(String[] args){
        TreeNode root = TreeNode.constructBinarySearchTree();
        BinarySearchTreeIterator i = new BinarySearchTreeIterator(root);
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
