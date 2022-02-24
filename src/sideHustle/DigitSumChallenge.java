package sideHustle;

import java.util.Scanner;

public class DigitSumChallenge {
    public static int sumDigits(int number){
        if(number>=10){

          int firstNumber=  number/100;
          int secondNumber = (number%100)/10;
          int thirdNumber = (number% 10);
int total = firstNumber + secondNumber + thirdNumber;
return total;
        }
        else {
            return -1;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some digits");
        int userInput = input.nextInt();

        System.out.println(sumDigits(userInput));
    }

}
