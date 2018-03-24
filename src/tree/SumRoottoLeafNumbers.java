package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shikha on 25/03/18.
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 *
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 *
 * Find the total sum of all root-to-leaf numbers.
 *
 * For example,
 *          1
 *         / \
 *        2   3
 *
 *        The root-to-leaf path 1->2 represents the number 12.
 *        The root-to-leaf path 1->3 represents the number 13.
 *        Return the sum = 12 + 13 = 25.
 */
public class SumRoottoLeafNumbers {
    public static int sumNumbers(TreeNode root) {
        List<Integer> path =new ArrayList<>();
        int rootToLeafSum =rootToLeafPath(root,path,0);
        return  rootToLeafSum;
    }

    private static int rootToLeafPath(TreeNode root ,List<Integer> path, int count) {
        int rootToLeaf =0;
        if(root==null)
            return 0;

        path.add(count,root.val);
        if(root.left==null && root.right==null){
            String pathStr="";
            for (int i=0;i<=count;i++){
                pathStr+= path.get(i);
            }
            rootToLeaf+=Integer.parseInt(pathStr);
        }
        rootToLeaf+= rootToLeafPath(root.left,path,count+1);
        rootToLeaf+=rootToLeafPath(root.right,path,count+1);

        return rootToLeaf;
    }

    public static void main(String[] args){
        TreeNode root = TreeNode.constructTree();
        System.out.println(sumNumbers(root));
    }
}
