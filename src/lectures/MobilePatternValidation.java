package lectures;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobilePatternValidation {
    static String mobileNumberPattern = "^\\+380\\d{9}$";

    public static void main(String[] args) {
        String[] mobileNumbers = {"+380123456789", "+380987654321", "1234567890", "+38012345"};
        for (String number : mobileNumbers) {
            boolean valid = validateMobileNumber(number);
            System.out.println(number + " is " + (valid ? "valid" : "invalid"));
        }
    }

    private static boolean validateMobileNumber(String number) {
        Pattern compiledPattern = Pattern.compile(mobileNumberPattern);
        Matcher matcher = compiledPattern.matcher(number);
        return matcher.matches();
    }
}
