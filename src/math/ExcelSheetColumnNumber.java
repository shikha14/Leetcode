package math;

/**
 * Created by Shikha on 20/04/18.
 */
public class ExcelSheetColumnNumber {

    public static int titleToNumber(String s) {
        int columnNumber =0;
        int len = s.length();
        int base=1;
        for(int i=len-1;i>=0;i--){
            char charAt= s.charAt(i);
            columnNumber+=base * (charAt-'A'+1);
            base*=26;
        }
        return columnNumber;
    }

    public static void main(String[] args){
        System.out.println(titleToNumber("AB"));
    }
}
