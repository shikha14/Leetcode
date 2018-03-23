package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shikha on 23/03/18.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int compliment = target - num;
            if(map.containsKey(compliment)){
                result[0]=map.get(compliment);
                result[1]=i;
            }
            map.put(num,i);
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums ={3,2,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }
}

