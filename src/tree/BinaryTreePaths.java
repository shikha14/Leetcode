package tree;

import sun.security.krb5.internal.PAData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shikha on 25/03/18.
 * Given a binary tree, return all root-to-leaf paths.
 *
 * For example, given the following binary tree:
 *
 *      1
 *    /   \
 *   2     3
 *   \
 *   5
 *
 *   All root-to-leaf paths are:
 *   ["1->2->5", "1->3"]
 */
public class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> rootToLeaf = new ArrayList<>();
        List<Integer> path =new ArrayList<>();
        rootToLeafPath(root,rootToLeaf,path,0);
        return  rootToLeaf;
    }

    private static void rootToLeafPath(TreeNode root, List<String> rootToLeaf, List<Integer> path, int count) {
        if(root==null)
            return;
        path.add(count,root.val);
        if(root.left==null && root.right==null){
            String pathStr="";
            int i=0;
            for (i=0;i<count;i++){
                pathStr+= path.get(i) +"->";
            }
            pathStr+= path.get(i);
            rootToLeaf.add(pathStr);
        }
        rootToLeafPath(root.left,rootToLeaf,path,count+1);
        rootToLeafPath(root.right,rootToLeaf,path,count+1);
    }

    public static void main(String[] args){
        TreeNode root = TreeNode.constructTree();
        System.out.println(binaryTreePaths(root));
    }
}
