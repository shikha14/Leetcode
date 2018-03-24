package tree;

/**
 * Created by Shikha on 16/03/18.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    static TreeNode constructTree() {
        TreeNode  root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.right = new TreeNode(7);
//        root.left.left = new TreeNode(15);
//        root.right.left = new TreeNode(21);
//        root.right.left.left = new TreeNode(22);
//        root.right.left.right = new TreeNode(26);
        return root;
    }

    static TreeNode constructBinarySearchTree() {
        TreeNode  root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        return root;
    }
}
