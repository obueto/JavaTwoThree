package sideHustle;

import java.util.Scanner;

public class CompareInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Enter a number");
        int number = input.nextInt();
        double firstNumber = Math.sqrt(number);
        System.out.println( "The square is "+ firstNumber);
        if (number >= 100 && firstNumber >= 100){
            System.out.println("They are greater than 100");

        }
        else System.out.println("They are less than 100");

    }


}
