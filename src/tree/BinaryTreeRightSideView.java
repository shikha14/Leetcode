package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Shikha on 16/03/18.
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 * For example:
 * Given the following binary tree,
 *               1            <---
 *             /   \
 *            2     3         <---
 *            \     \
 *             5     4       <---
 *You should return [1, 3, 4].
        */
public class BinaryTreeRightSideView {
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightViewList = new ArrayList();
        if(root==null)
            return rightViewList;

        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            TreeNode temp = queue.peek();
            queue.remove();

            if(temp==null){
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }else{
                TreeNode next=queue.peek();
                if(next==null)
                    rightViewList.add(temp.val);

                if(temp.left!=null){
                    queue.add(temp.left);
                }

                if(temp.right!=null){
                    queue.add(temp.right);
                }

            }

        }
        return rightViewList;

    }

    public static void main(String[] args){
        TreeNode  root = TreeNode.constructTree();
        System.out.println("RightView:"+rightSideView(root));
    }
}
