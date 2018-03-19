package tree;

/**
 * Created by Shikha on 19/03/18.
 * Invert a binary tree.
 *              4
 *            /   \
 *          2     7
 *         / \   / \
 *        1   3 6   9
 * to
 *            4
 *          /   \
 *         7     2
 *        / \   / \
 *       9   6 3   1
 */
public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;

        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);

        root.left=right;
        root.right = left;

        return root;

    }
    public static void main(String[] args){
        TreeNode root = TreeNode.constructTree();
        System.out.println(root.toString());
        System.out.println(invertTree(root).toString());
    }
}
