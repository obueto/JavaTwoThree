package chapterFour;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five digit number: ");
        int userInput = scanner.nextInt();

        int firstDigit = (userInput / 10000);
        int secondDigit = (userInput % 10000)/1000;
        int thirdDigit = (userInput % 1000)/100;
        int fourthDigit = (userInput % 100)/10;
        int lastDigit = (userInput % 10);

        if (firstDigit == lastDigit){
            if (secondDigit == fourthDigit){
                System.out.println("Its a palindrome");
            }
        }
        else {
            System.out.println("Its not a palindrome");
        }
    }
}
