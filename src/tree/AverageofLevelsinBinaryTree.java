package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Shikha on 16/03/18.
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 * Example 1:
 * Input:
 *           3
 *          / \
 *         9  20
 *       /  \
 *     15   7
 *  Output: [3, 14.5, 11]
 *  Explanation:
 *  The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 *  Note:
 *  The range of node's value is in the range of 32-bit signed integer.
 */
public class AverageofLevelsinBinaryTree {
    static class CountSumPair{
        long sum;
        int count;

        CountSumPair(){
            this.sum =0;
            this.count=0;
        }
    }
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> listOfAverageLevel = new ArrayList();
        if(root==null)
            return listOfAverageLevel;

        Queue<TreeNode> queue =new LinkedList();
        CountSumPair countSumPair= new CountSumPair();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            TreeNode temp = queue.peek();
            queue.remove();

            if(temp==null){
                listOfAverageLevel.add(new Double(countSumPair.sum)/countSumPair.count);
                if(!queue.isEmpty()){
                    queue.add(null);
                    countSumPair= new CountSumPair();
                }
            }else{
                countSumPair.sum+=temp.val;
                countSumPair.count+=1;

                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
        }

        return listOfAverageLevel;

    }

    public static Double getAverage(List<Integer> list) {
        if(list.isEmpty())
            return 0.0;
        Double total=0.0;
        for(Integer num:list){
            total +=num;
        }

        return total/list.size();

    }

    public static void main(String[] args){
        TreeNode  root = TreeNode.constructTree();
        System.out.println(averageOfLevels(root));
    }

    //[3.0, 14.5, 14.333333333333334, 24.0]
}
