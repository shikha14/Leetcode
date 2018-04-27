package bitmanipulation;

/**
 * Created by Shikha on 27/04/18.
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.

 Note:

 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 Example 1:

 Input: [2,2,1]
 Output: 1
 Example 2:

 Input: [4,1,2,1,2]
 Output: 4
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int xor=nums[0];
        for(int i=1;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
       return xor;
    }

    public static void main(String[] args){
        int[] arr ={2,2,1};
        System.out.println(singleNumber(arr));
        int[] arr1 ={4,1,2,1,2};
        System.out.println(singleNumber(arr1));
    }
}
