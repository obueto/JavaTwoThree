package chapterFive;

import java.util.Scanner;

public class SumOfTwoExtremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNUmber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int total =0;
        for (int i = 0; i < 10; i++){
            System.out.println("Enter a number");
         int userInput = scanner.nextInt();

            if (userInput > maxNUmber){
                maxNUmber = userInput;}
            if (userInput< minNumber){
                minNumber = userInput;
            }

    }
        total = maxNUmber + minNumber;
        System.out.println("The sum of both values are " + total);
}
}
