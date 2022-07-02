package chapterFourteen;

import java.util.Arrays;
import java.util.Scanner;

public class TokenizingTelephoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phoneNumber");
        String userInput = scanner.next();
        System.out.println(Arrays.toString(userInput.split(" ")));


    }
}
