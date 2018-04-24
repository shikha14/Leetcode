package math;

/**
 * Created by Shikha on 20/04/18.
 */
public class ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        String title = "";
        while (n>0){
            int rem = n % 26;
            if(rem==0){
                // number is  from 1 to 26 (not 0 to 25)
                title='Z'+title;
                n= n/26 -1;
            }else{
                title=(char)((rem-1)+'A')+ title;
                n= n/26;
            }
        }
        return title;

    }

    public static void main(String[] args){
        System.out.println(convertToTitle(705));
    }
}
