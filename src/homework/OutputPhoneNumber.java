package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OutputPhoneNumber {
    public static void main(String[] args) {
        // PUT YOUR CODE HERE
        String inputText = new Scanner(System.in).nextLine();
        Pattern compilePattern = Pattern.compile("^[+]\\d-\\d{3}-\\d{3}-\\d{4}$");
        String[] numbersArray = inputText.split(":|\\s|,|[.]");
        for (String number : numbersArray) {
            Matcher matcher = compilePattern.matcher(number);
            if (matcher.find())
                System.out.println(matcher.group());
        }
    }
}
