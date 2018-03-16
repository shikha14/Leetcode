package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Shikha on 16/03/18.
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * For example:
 * Given binary tree [1,null,2,3],
 *                1
 *                \
 *                2
 *               /
 *              3
 *  return [1,2,3].
 *Note: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreePreorderTraversal {

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrderList = new ArrayList();
        if(root==null)
            return preOrderList;
        Stack stack = new Stack();
        TreeNode temp = root;
        stack.push(temp);
        while(!stack.isEmpty()){
            temp =(TreeNode) stack.pop();
            preOrderList.add(temp.val);

            if(temp.right!=null)
                stack.push(temp.right);

            if(temp.left!=null)
                stack.push(temp.left);
        }
        return preOrderList;

    }


    public static void main(String[] args){
        TreeNode  root = TreeNode.constructTree();
        System.out.println(preorderTraversal(root));
    }

}
