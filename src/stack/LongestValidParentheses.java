package stack;

import java.util.Stack;

/**
 * Created by Shikha on 09/04/18.
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 * Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class LongestValidParentheses {
    static final int OPENING_BRACKET = 1;
    static final int CLOSING_BRACKET = 2;
    public static int longestValidParentheses(String s) {
            int longestParenthesis = 0;
            Stack<int[]> stack = new Stack();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    stack.push(new int[]{i,OPENING_BRACKET});
                }else if(s.charAt(i)==')'){
                    if(stack.isEmpty() || stack.peek()[1]!=OPENING_BRACKET){
                        stack.push(new int[]{i,CLOSING_BRACKET});
                    }else{
                        int count=0;
                        stack.pop();
                        if(stack.isEmpty()){
                            count=i+1;
                        }else{
                            count=i-stack.peek()[0];
                        }
                        if(count>longestParenthesis)
                            longestParenthesis=count;
                    }

                }
            }

            return longestParenthesis;
    }

    public static void main(String[] args){
        String parentheses="(()";
        System.out.println(longestValidParentheses(parentheses));
        System.out.println(longestValidParentheses(")()())"));
    }
}
