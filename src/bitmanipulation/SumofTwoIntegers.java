package bitmanipulation;

/**
 * Created by Shikha on 27/03/18.
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *
 * Example:
 * Given a = 1 and b = 2, return 3.
 */
public class SumofTwoIntegers {
    public static int getSum(int a, int b) {
        while(b!=0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args){
        System.out.println(getSum(14,15));
    }
}
