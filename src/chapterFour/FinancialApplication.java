package chapterFour;

import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your monthly saving amount");
        int userInput = scanner.nextInt();
        for (int i = 1; i < 7; i++) {
           double interestRate = userInput * (i + 0.00417);
            double monthlySum = interestRate;

            System.out.printf("Your monthly savings in month %d is %f%n ",i, monthlySum );
        }
    }

}
