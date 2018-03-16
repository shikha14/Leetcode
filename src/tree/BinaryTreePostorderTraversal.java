package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Shikha on 16/03/18.
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * For example:
 * Given binary tree [1,null,2,3],
 *                        1
 *                        \
 *                        2
 *                       /
 *                      3
 * return [3,2,1].
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreePostorderTraversal {

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>postOrderList = new ArrayList();
        if(root==null)
            return postOrderList;

        Stack stack = new Stack();
        TreeNode temp = root;
        TreeNode preVisited = root;

        while(temp!=null){
            stack.push(temp);
            temp= temp.left;
        }

        while(!stack.isEmpty()){
            temp = (TreeNode)stack.pop();
            if(temp.right==null || temp.right==preVisited){
                postOrderList.add(temp.val);
                preVisited=temp;
            }else{
                stack.push(temp);
                temp= temp.right;
                while(temp!=null){
                    stack.push(temp);
                    temp = temp.left;
                }

            }


        }



        return postOrderList;

    }

    public static void main(String[] args){
        TreeNode  root = TreeNode.constructTree();
        System.out.println(postorderTraversal(root));
    }
}
