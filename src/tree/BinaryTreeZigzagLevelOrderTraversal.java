package tree;

import java.util.*;

/**
 * Created by Shikha on 15/03/18.
 * Given a binary tree, return the zigzag level order traversal of its nodes' values.
 * (ie, from left to right, then right to left for the next level and alternate between).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *               3
 *              / \
 *             9  20
 *           /  \
 *          15   7
 * return its zigzag level order traversal as:
 *         [
 *            [3],
 *           [20,9],
 *           [15,7]
 *         ]
 */



public class BinaryTreeZigzagLevelOrderTraversal {
    public  static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigZagTraversalList = new ArrayList<>();
        if(root==null)
            return zigZagTraversalList;

        Stack rightToLeftStack=new Stack();
        Stack leftToRightStack=new Stack();

        rightToLeftStack.add(root);

        while(!rightToLeftStack.isEmpty() || !leftToRightStack.isEmpty()){
            if(!rightToLeftStack.isEmpty()){
                List<Integer> list =new ArrayList<>();
                while(!rightToLeftStack.isEmpty()){
                    TreeNode temp = (TreeNode) rightToLeftStack.pop();
                    list.add(temp.val);

                    if(temp.left!=null)
                        leftToRightStack.add(temp.left);

                    if(temp.right!=null)
                        leftToRightStack.add(temp.right);


                }
                zigZagTraversalList.add(list);
            }


            if(!leftToRightStack.isEmpty()){
                List<Integer> list =new ArrayList<>();
                while(!leftToRightStack.isEmpty()){
                    TreeNode temp = (TreeNode) leftToRightStack.pop();

                    list.add(temp.val);

                    if(temp.right!=null)
                        rightToLeftStack.push(temp.right);

                    if(temp.left!=null)
                        rightToLeftStack.push(temp.left);
                }

                zigZagTraversalList.add(list);
            }

        }

        return zigZagTraversalList;

    }


    public static void main(String[] args){
        TreeNode  root = TreeNode.constructTree();
        System.out.println(zigzagLevelOrder(root));

    }
}
