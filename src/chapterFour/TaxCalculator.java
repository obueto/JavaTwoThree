package chapterFour;

import java.util.Scanner;

public class TaxCalculator {


    public static int calculateEarnings(int earnings,String name){
        if (earnings<= 30_000){
            int rate = (int) (0.15 * earnings);
            return rate;}
        else {
            int rate1 = (int) (0.20 * earnings);
            return rate1;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int count = 0; count < 3; count++) {
            System.out.println("Enter the total amount you earn ");
            int userInput = scanner.nextInt();
            System.out.println("Enter your name");
            String userInputName = scanner.next();
            System.out.println("Your total Tax is : " + calculateEarnings(userInput, userInputName));


        }
    }
}
