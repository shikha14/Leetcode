package math;

/**
 * Created by Shikha on 24/04/18.
 * Given an integer, return its base 7 string representation.
 *
 * Example 1:
 * Input: 100
 * Output: "202"
 *
 * Example 2:
 * Input: -7
 * Output: "-10"
 *
 * Note: The input will be in range of [-1e7, 1e7].
 */
public class Base7 {

    public  static String convertToBase7(int num) {
        String result="";
        int data =num;
        num = Math.abs(num);
        while (num>0){
            int rem = num % 7;
            result=rem+result;
            num= num/7;
        }
        if(data<0){
            return "-"+result;
        }else if(data==0){
            return "0";
        }else
        {
            return result;
        }


    }

    public static void main(String[] args){
        System.out.println(convertToBase7(101));
        System.out.println(convertToBase7(-7));
    }


}
