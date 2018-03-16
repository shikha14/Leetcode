package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Shikha on 16/03/18.
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *                   3
 *                  / \
 *                 9  20
 *               /  \
 *             15   7
 *  return its level order traversal as:
 *           [
 *              [3],
 *              [9,20],
 *              [15,7]
 *          ]
 */
public class BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrderList = new ArrayList();
        if(root==null)
            return levelOrderList;

        Queue<TreeNode> queue =new LinkedList();
        List<Integer> list =new ArrayList();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            TreeNode temp = queue.peek();
            queue.remove();
            if(temp==null){
                levelOrderList.add(list);
                if(!queue.isEmpty()){
                    queue.add(null);
                    list = new ArrayList();
                }

            }else{
                list.add(temp.val);
                if(temp.left!=null)
                    queue.add(temp.left);

                if(temp.right!=null)
                    queue.add(temp.right);

            }
        }

        return levelOrderList;
    }


    public static void main(String[] args){
        TreeNode  root = TreeNode.constructTree();
        System.out.println(levelOrder(root));
    }
}

