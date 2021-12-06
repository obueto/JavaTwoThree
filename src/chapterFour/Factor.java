package chapterFour;

import java.util.Scanner;

public class Factor {
    public  static int calculateFactorsOf(int userInput){
        int factor = 0; //count
        for (int number = 1; number<= userInput; number++){ if (userInput % number == 0){factor++;}}
            return factor;}

    public static void main(String[] args) {
        calculatePrimeNumber();
    }

    public static void calculatePrimeNumber() {
        System.out.println("Enter a number to check for");
        Scanner inputCollector = new Scanner(System.in);
        int userInput = inputCollector.nextInt();
        int result = calculateFactorsOf(userInput);
        if (result<= 2) System.out.printf("%d is a prime number%n",userInput);
        else System.out.printf("%d is not a prime number%n", userInput);


    }
    //public static void isEven(int number){
      //  if(number % 2 == 0 );
        //System.out.println("it is even");

    }

