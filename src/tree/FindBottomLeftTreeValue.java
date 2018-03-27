package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shikha on 25/03/18.
 * Given a binary tree, find the leftmost value in the last row of the tree.
 *
 * Example 1:
 *
 * Input:
 *
 *               2
 *              / \
 *             1   3
 * Output:
 *          1
 *
 * Example 2:
 *
 * Input:
 *
 *              1
 *             / \
 *            2   3
 *           /   / \
 *          4   5   6
 *             /
 *             7
 * Output:
 *        7
 *
 * Note: You may assume the tree (i.e., the given root node) is not NULL.
 */
public class FindBottomLeftTreeValue {

    public  int findBottomLeftValue(TreeNode root) {
        List<Integer> nodeList =new ArrayList<>();
        findBottomLeft(root,height(root),nodeList);
        return nodeList.get(0);
    }

    private  void findBottomLeft(TreeNode root, int level, List<Integer> nodeList) {
        if(root==null)
            return ;

        if(level==1){
           nodeList.add(root.val);
        }

        findBottomLeft(root.left,level-1, nodeList);
        findBottomLeft(root.right,level-1, nodeList);
    }


    public  int height(TreeNode root){
        if(root==null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight>rightHeight)
            return leftHeight+1;
        else
            return rightHeight+1;
    }

    public static void main(String[] args){
        TreeNode root = TreeNode.constructTree1();
        System.out.println(new FindBottomLeftTreeValue().findBottomLeftValue(root));
    }
}
