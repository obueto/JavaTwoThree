package chapterTwo;

import java.util.Scanner;

public class SeparatingDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 digits");
        int userInput = scan.nextInt();
        int firstDigit = userInput / 10000;
        int secondDigit = (userInput %10000)/1000;
        int thirdDigit = (userInput %1000)/100;
        int fourthDigit = (userInput %100)/10;
        int fifthDigit = (userInput % 10);
        System.out.printf("%d %d %d %d %d",firstDigit,secondDigit,thirdDigit,fourthDigit,fifthDigit);

    }
}
