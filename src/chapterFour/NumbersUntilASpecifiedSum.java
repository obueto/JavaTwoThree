package chapterFour;

import java.util.Scanner;

public class NumbersUntilASpecifiedSum {
    public static void main(String[] args) {
       int sum =  0;
       int number =0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        number = input.nextInt();
        for (int count = 0;sum <= number ;count++){
            System.out.println("Enter a number: ");
         int userInput = input.nextInt();

sum +=userInput;



    }
        System.out.println("The sum of the input is : " + sum);
}
}
