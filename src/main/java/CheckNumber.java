import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vilagra on 23.03.2016.
 */

public class CheckNumber {
    public static void main(String[] args) {

    }

    public static boolean checkOnValidity(String number){
        if(number==null) {
            throw new IllegalArgumentException();
        }
        String valid = "^(\\+\\d8)?\\d{10}$||^(\\+\\d8)?\\(\\d{3}\\)\\d+-?\\d+-?\\d+$|^\\+?\\d{0,12}-\\d{0,12}-?\\d+$";
        Pattern val = Pattern.compile(valid);
        Matcher m = val.matcher(number);
        return  m.matches();
    }
}
