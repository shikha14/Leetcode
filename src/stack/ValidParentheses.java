package stack;

import java.util.Stack;

/**
 * Created by Shikha on 18/03/18.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack stack = new Stack();
        for(int i=0;i<s.length();i++){
            char charAtIndex = s.charAt(i);

            if(charAtIndex=='(' || charAtIndex=='{' ||charAtIndex=='[' ){
                stack.push(charAtIndex);
            }else if(charAtIndex==')' || charAtIndex=='}' ||charAtIndex==']' ){
                if(stack.isEmpty())
                    return false;
                char charAtTop = (char) stack.peek();
                if(isMatchingParentheses(charAtTop,charAtIndex)){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    private static boolean isMatchingParentheses(char charAtTop, char charAtIndex) {
        if(charAtTop=='(' && charAtIndex==')')
            return true;
        else if(charAtTop=='{' && charAtIndex=='}')
            return true;
        else if(charAtTop=='[' && charAtIndex==']')
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid(")]{}"));
        System.out.println(isValid("("));
    }

}
