package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Shikha on 16/03/18.
 * You need to find the largest value in each row of a binary tree.
 * Example:
 * Input:
 *              1
 *             / \
 *            3   2
 *          / \   \
 *         5   3   9
 *
 *Output: [1, 3, 9]
 */
public class FindLargestValueinEachTreeRow {
    public static List<Integer> largestValues(TreeNode root) {
        List<Integer>largestValueList =new ArrayList();
        if(root==null)
            return largestValueList;

        Queue<TreeNode> queue = new LinkedList();
        int rowMax = Integer.MIN_VALUE;
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            TreeNode temp= queue.peek();
            queue.remove();

            if(temp==null){
                largestValueList.add(rowMax);
                if(!queue.isEmpty()){
                    queue.add(null);
                    rowMax = Integer.MIN_VALUE;
                }

            }else{
                if(rowMax<temp.val)
                    rowMax=temp.val;
                if(temp.left!=null)
                    queue.add(temp.left);

                if(temp.right!=null)
                    queue.add(temp.right);
            }

        }

        return largestValueList;
    }



    public static void main(String[] args){
        TreeNode  root = TreeNode.constructTree();
        System.out.println(largestValues(root));
    }
}
