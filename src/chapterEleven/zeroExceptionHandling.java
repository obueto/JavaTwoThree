package chapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;


public class zeroExceptionHandling {

    private static int firstNumber;
    public static void main(String[] args) {
      int number =   input("Enter a number");
      int number2 = input("Enter the second number");
      int result = number / number2;
    }

   public static int input(String message){
       Scanner scanner= new Scanner (System.in);
       System.out.println(message);
       try{
          int input = scanner.nextInt();
          return input;
       }
       catch (InputMismatchException e){

           System.out.println("Wrong input Try Again");

          return input(message);
       }
   }
}
