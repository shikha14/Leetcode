package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shikha on 16/03/18.
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *              3
 *             / \
 *            9  20
 *          /  \
 *        15   7
 * return its bottom-up level order traversal as:
 *      [
 *       [15,7],
 *       [9,20],
 *       [3]
 *     ]
 */
public class BinaryTreeLevelOrderTraversalII {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> traversalList = new ArrayList();
        int height = height(root);
        for(int i= height;i>=1;i--){
            List<Integer> levelTraversalList = new ArrayList();
            getlevelOrder(root,i,levelTraversalList);
            traversalList.add(levelTraversalList);

        }
        return traversalList;

    }

    public static void getlevelOrder(TreeNode root, int level, List<Integer> list) {
        if(root ==null)
            return;

        if(level==1)
        {
            list.add(root.val);
            return;
        }
        getlevelOrder(root.left,level-1,list);
        getlevelOrder(root.right,level-1,list);

    }


    public static int height(TreeNode root){
        if(root==null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight>rightHeight){
            return leftHeight+1;
        }else{
            return rightHeight+1;
        }

    }


    public static void main(String[] args){
        TreeNode  root = TreeNode.constructTree();
        System.out.println(levelOrderBottom(root));
    }
}
