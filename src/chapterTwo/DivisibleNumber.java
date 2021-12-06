package chapterTwo;

import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String[] args) {
        int divide;
        int three;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter a number   ");

        divide = input.nextInt();

        three = divide % 3;


        System.out.println ( divide + " is divisible by 3");

    }
}
