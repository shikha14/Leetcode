package stack;

import java.util.Stack;

/**
 * Created by Shikha on 19/03/18.
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1,
 * find the area of largest rectangle in the histogram.
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.For example,
 * Given heights = [2,1,5,6,2,3],
 * Width of histogram bar 1
 * return 10.
 */
public class LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack();
        int index =0;
        int area = 0;
        int maxArea =0;
        while (index<heights.length){
            if(stack.isEmpty() || heights[stack.peek()]<=heights[index]){
                stack.push(index++);
            }else{
                int topIndex = stack.pop();
                int barWidth = stack.isEmpty()? index : (index-stack.peek()-1);
                area = barWidth * heights[topIndex];

                if(area>maxArea)
                    maxArea= area;
            }
        }

        while (!stack.isEmpty()){
            int topIndex = stack.pop();
            int barWidth = stack.isEmpty()? index : (index-stack.peek()-1);
            area = barWidth * heights[topIndex];

            if(area>maxArea)
                maxArea= area;
        }

        return  maxArea;
    }


    public static void main(String[] args){
        int[] heights = {5,4,1,2};
        System.out.println(largestRectangleArea(heights));
    }
}
