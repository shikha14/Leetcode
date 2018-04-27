package hashmap;

import java.util.HashMap;

/**
 * Created by Shikha on 27/04/18.
 *You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:

 Input: J = "aA", S = "aAAbbbb"
 Output: 3
 Example 2:

 Input: J = "z", S = "ZZ"
 Output: 0
 Note:

 S and J will consist of letters and have length at most 50.
 The characters in J are distinct.
 */
public class JewelsandStones {

    public static int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer>  jewelMap = new HashMap<>();
        for(int i=0;i<J.length();i++){
            jewelMap.put(J.charAt(i),0);
        }

        int count =0;
        for(int i=0;i<S.length();i++){
            if(jewelMap.containsKey(S.charAt(i))){
                count++;
            }
        }
        return count;

    }


    public static void main(String[] args){
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
        System.out.println(numJewelsInStones("z","ZZ"));

    }
}
