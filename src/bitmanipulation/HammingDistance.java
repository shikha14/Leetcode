package bitmanipulation;

/**
 * Created by Shikha on 22/03/18.
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * Note:
 * 0 ≤ x, y < 231.
 */
public class HammingDistance {
    public static int  hammingDistance(int x, int y) {
        int xor = x ^ y;
        return Integer.bitCount(xor);
    }

    public static void main(String[] args){
        System.out.println("Hamming Distance:"+hammingDistance(1,4));
    }

}
