package tree;

/**
 * Created by Shikha on 16/03/18.
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *                  3
 *                 / \
 *                9  20
 *              /  \
 *            15   7
 *  return its depth = 3.
 */
public class MaximumDepthofBinaryTree {
    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if(leftDepth>rightDepth)
            return leftDepth+1;
        else
            return rightDepth+1;

    }

    public static void main(String[] args){
        TreeNode  root = TreeNode.constructTree();
        System.out.println("Maximum Depth:"+maxDepth(root));
    }
}
