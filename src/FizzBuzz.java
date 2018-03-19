import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shikha on 19/03/18.
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 * Example:
 *
 * n = 15,

 * Return:
 * [
 *  "1",
 *  "2",
 *  "Fizz",
 *  "4",
 *  "Buzz",
 *  "Fizz",
 *  "7",
 *  "8",
 *  "Fizz",
 *  "Buzz",
 *  "11",
 *  "Fizz",
 *  "13",
 *  "14",
 * "FizzBuzz"
 * ]
 */
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> outputList =new ArrayList<>();
        for(int i= 1;i <= n;i++){
            if(i% 3 == 0 && i% 5 ==0){
                outputList.add("FizzBuzz");
            }else if(i% 3 == 0 ){
                outputList.add("Fizz");
            }else if(i% 5 ==0){
                outputList.add("Buzz");
            }else{
                outputList.add(i+"");
            }
        }
        return outputList;
    }

    public static void main(String[] args){
        System.out.println(fizzBuzz(15));
    }
}
