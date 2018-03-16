package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Shikha on 16/03/18.
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * For example:
 * Given binary tree [1,null,2,3],
 *              1
 *              \
 *               2
 *              /
 *             3
 *return [1,3,2].
 *Note: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderList =new ArrayList();
        if(root==null)
            return inorderList;
        Stack stack = new Stack();

        TreeNode temp= root;
        while(temp!=null){
            stack.push(temp);
            temp= temp.left;
        }

        while(!stack.isEmpty()){
            temp= (TreeNode)stack.pop();
            inorderList.add(temp.val);

            if(temp.right!=null){
                temp= temp.right;
                while(temp!=null){
                    stack.push(temp);
                    temp = temp.left;
                }
            }

        }

        return inorderList;

    }

    public static void main(String[] args){
        TreeNode  root = TreeNode.constructTree();
        System.out.println(inorderTraversal(root));
    }
}
