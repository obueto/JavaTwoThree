package chapterFour;

import java.util.Scanner;

public class FindTheLargeNumber {
    public static void main(String[] args) {
int largestNumber = 0;

        Scanner input = new Scanner(System.in);
        for (int counter = 0;counter < 10;counter++) {
            System.out.println("Enter a number");
            int number = input.nextInt();
            largestNumber = Math.max(number, largestNumber);
        }
        System.out.println("The largest number is " + largestNumber);
}
}
