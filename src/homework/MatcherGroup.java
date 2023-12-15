package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherGroup {
    public static void main(String[] args) {
        // PUT YOUR CODE HERE
        String inputStr = new Scanner(System.in).nextLine();
        Pattern compilePattern = Pattern.compile("\\d{3}");
        String[] inputArray = inputStr.split("\\D");
        for (String string : inputArray) {
            Matcher matcher = compilePattern.matcher(string);
            if (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
