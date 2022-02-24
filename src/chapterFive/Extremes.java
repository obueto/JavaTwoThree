package chapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        int total = 0;
        int userInput = 0;
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);
      for (int count = 0; count < 5;count++){
        System.out.println("Enter a number");
         userInput = input.nextInt();

          maxNumber =  Math.max(userInput,maxNumber);
          minNumber = Math.min( userInput,minNumber);
    }

        total = maxNumber + minNumber;
        System.out.println("Max number " + maxNumber);
        System.out.println("Min number " + minNumber);
       System.out.println("The sum of the two extremes is : " + total);
}
}
