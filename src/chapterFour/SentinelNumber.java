package chapterFour;

import java.util.Scanner;

public class SentinelNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int total = 0;
        int count = 0;
        int minNumber = 0;
        int maxNumber = 0;
        double average;

        System.out.println("Enter number or -42 to exit: ");
        number = scanner.nextInt();

        while (number != -42){
            System.out.println("Enter number or -42 to exit: ");
            number = scanner.nextInt();
            total += number;
            count++;
            if (number < minNumber){
                minNumber = number;
            }
            if (number > maxNumber){
                maxNumber = number;
            }
        }

        average = total / count;
        System.out.printf("The sum, average, minimum and maximum of the following numbers are %d, %2f, %d and %d respectively", total, average, minNumber, maxNumber);

    }
}
