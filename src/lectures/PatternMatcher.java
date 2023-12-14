package lectures;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        String[] texts = {"This cat is black.", "The dog is brown.", "The bird is flying.", "The cat is sleeping."};
        String pattern = "cat";

        Pattern compilePattern = Pattern.compile(pattern);
        for (String text : texts) {
            Matcher matcher = compilePattern.matcher(text);
            if (matcher.find()) {
                System.out.println("Match of " + matcher.group() + " found in: " + text);
            }
        }
    }
}
