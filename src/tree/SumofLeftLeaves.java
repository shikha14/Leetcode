package tree;

/**
 * Created by Shikha on 23/03/18.
 * Find the sum of all left leaves in a given binary tree.
 * Example:

 3
 / \
 9  20
 /  \
 15   7

 *There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
public class SumofLeftLeaves {

    public static int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        int sum =0;
        if(root.left!=null && root.left.left==null && root.left.right==null)
            sum+=root.left.val;

        sum+=sumOfLeftLeaves(root.left);
        sum+=sumOfLeftLeaves(root.right);

        return sum;

    }

    public static void main(String[] args){
        TreeNode root = TreeNode.constructTree();
        System.out.println(sumOfLeftLeaves(root));
    }
}
