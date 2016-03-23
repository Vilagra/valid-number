import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vilagra on 23.03.2016.
 */

public class CheckNumber {
    public static void main(String[] args) {

    }

    public static boolean checkOnValidity(String number){
        String valid = "^\\+\\d{12}$|^\\d{10}$|^\\+?\\d{0,12}\\(\\d{3}\\)\\d+$|^\\+\\d{0,12}-\\d{0,12}-?\\d+$|^\\+?\\d{0,12}\\(\\d{3}\\)\\d{0,12}-\\d{0,12}-?\\d+$|^\\d{1,9}-\\d{1,9}-?\\d+$";
        Pattern val = Pattern.compile(valid);
        Matcher m = val.matcher(number);
        return  m.matches();
    }
}
