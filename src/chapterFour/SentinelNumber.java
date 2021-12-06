package chapterFour;

import java.util.Scanner;

public class SentinelNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int total = 0;
        int count = 0;
        int min = 0;
        int max = 0;
        double average;

        System.out.println("Enter number or -42 to exit: ");
        num = scanner.nextInt();

        while (num != -42){
            System.out.println("Enter number or -42 to exit: ");
            num = scanner.nextInt();
            total += num;
            count++;
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
            average = total / count;
        }

        average = total / count;
        System.out.printf("The sum, average, minimum and maximum of the following numbers are %d, %2f, %d and %d respectively", total, average, min, max);

    }
}
