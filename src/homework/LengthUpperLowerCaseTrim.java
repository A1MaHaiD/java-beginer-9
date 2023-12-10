package homework;

import java.util.Scanner;

public class LengthUpperLowerCaseTrim {
    public static void main(String[] args) {
        // PUT YOUR CODE HERE
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println(inputStr.length());
        System.out.println(inputStr.toUpperCase());
        System.out.println(inputStr.toLowerCase());
        System.out.println(inputStr.trim());
    }
}
