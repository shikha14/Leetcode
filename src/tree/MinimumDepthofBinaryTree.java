package tree;

/**
 * Created by Shikha on 16/03/18.
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class MinimumDepthofBinaryTree {
    public static int minDepth(TreeNode root) {
        return minDepthRecursive(root,0);
    }

    public static int minDepthRecursive(TreeNode root, int pathLength) {
        if(root==null)
            return 0;

        pathLength++;

        if(root.left==null && root.right==null){
            return pathLength;
        }

        int leftDepth = minDepthRecursive(root.left,pathLength);
        int rightDepth = minDepthRecursive(root.right,pathLength);

        if(rightDepth<leftDepth)
            return rightDepth!=0?rightDepth:leftDepth;
        else
            return leftDepth!=0?leftDepth:rightDepth;

    }
    public static void main(String[] args){
        TreeNode  root = TreeNode.constructTree();
        System.out.println("Minimum Depth:"+minDepth(root));
    }
}
