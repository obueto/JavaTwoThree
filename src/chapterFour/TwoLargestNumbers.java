package chapterFour;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        int largeNumber = 0;
        int secondLargeNumber = 0;
        Scanner scanner = new Scanner(System.in);
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();

            secondLargeNumber = Math.min(largeNumber,Math.max(number,secondLargeNumber));
            largeNumber = Math.max(number, largeNumber);
        }
        System.out.println("The largest number is " + largeNumber );
        System.out.println("The second largest  number is " + secondLargeNumber);
    }

}
