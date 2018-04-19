package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Shikha on 19/03/18.
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.
 *
 * Example 1:
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * Output: [-1,3,-1]
 * Explanation:
 * For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
 * For number 1 in the first array, the next greater number for it in the second array is 3.
 * For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
 *
 * Example 2:
 * Input: nums1 = [2,4], nums2 = [1,2,3,4].
 * Output: [3,-1]
 * Explanation:
 * For number 2 in the first array, the next greater number for it in the second array is 3.
 * For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
 * Note:
 * All elements in nums1 and nums2 are unique.
 * The length of both nums1 and nums2 would not exceed 1000.
 */
public class NextGreaterElementI {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] resultArray= new int[nums1.length];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],i);
            resultArray[i]=-1;
        }
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<nums2.length;i++){
            if(stack.isEmpty() || stack.peek()>=nums2[i])
                stack.push(nums2[i]);
            else{
                while (!stack.isEmpty() && stack.peek()< nums2[i]){
                    int element = stack.pop();
                    if(map.containsKey(element)){
                        int index=map.get(element);
                        resultArray[index]=nums2[i];
                    }
                }
                stack.push(nums2[i]);

            }
        }
        return  resultArray;
    }

    public static void main(String[] args){
//        int[] nums1 ={4,1,2};
//        int[] nums2 ={1,3,4,2};

        int[] nums1 ={2,4};
        int[] nums2 ={1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
}
