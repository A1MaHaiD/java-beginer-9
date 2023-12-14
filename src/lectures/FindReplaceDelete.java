package lectures;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindReplaceDelete {
    public static void main(String[] args) {
//        startEnd();
//        replaced();
//        replacedToEmpty();
    }

    private static void replacedToEmpty() {
        String text = "Hello, Java! Nice to see you, Java!";
        String pattern = "Java";

        Pattern compilePattern = Pattern.compile(pattern);
        Matcher matcher = compilePattern.matcher(text);

        String removedText = matcher.replaceAll("");
        System.out.println("Removed text: " + removedText);
    }

    private static void replaced() {
        String text = "Hello, World! Nice to see you, World!";
        String pattern = "World";

        Pattern compilePattern = Pattern.compile(pattern);
        Matcher matcher = compilePattern.matcher(text);

        String replacedText = matcher.replaceAll("Java");
        System.out.println("Replaced text: " + replacedText);
    }

    private static void startEnd() {
        String text = "The cat is black. The hat is red.";
        String pattern = "cat";

        Pattern compilePattern = Pattern.compile(pattern);
        Matcher matcher = compilePattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Match found at position " + matcher.start() + "-" + (matcher.end() - 1));
        }
    }
}
