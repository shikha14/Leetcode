package bitmanipulation;

/**
 * Created by Shikha on 22/03/18.
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */
public class Numberof1Bits {
    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

    public static int hammingWeightWithoutInbuiltFunction(int n) {
        int count=0;
        while(n!=0){
            count++;
            n &= n-1;
        }
        return count;
    }


    public static void main(String[] args){
        int n= 11;
        System.out.println("Hamming Weight:"+hammingWeightWithoutInbuiltFunction(7));
    }
}
