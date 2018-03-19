package stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Shikha on 19/03/18.
 * Given a list of daily temperatures, produce a list that, for each day in the input, tells you how many days you would have to wait until a warmer temperature.
 * If there is no future day for which this is possible, put 0 instead.
 * For example, given the list temperatures = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 * Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].
 */
public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] outputList = new int[temperatures.length];
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            if(stack.isEmpty())
                stack.push(i);
            else{
                while (!stack.isEmpty() && temperatures[stack.peek()]< temperatures[i]){
                    int topIndex = stack.pop();
                    outputList[topIndex]= i-topIndex;
                }

                stack.push(i);
            }
        }

        while (!stack.isEmpty()){
            outputList[stack.pop()]=0;
        }
        return outputList;
    }

    public static void main(String[] args){
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
