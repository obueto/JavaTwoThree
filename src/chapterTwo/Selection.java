package chapterTwo;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter first number");
        int firstNumber  =input.nextInt();

        System.out.print ("Enter second number");
        int secondNumber = input.nextInt ();


        if  (firstNumber ==secondNumber)
        {
            System.out.println ( " the numbers are equal to");
        }

        if (firstNumber > secondNumber)

        {
            System.out.println (firstNumber +  " is larger");
        }


        if (secondNumber > firstNumber)
        {
            System.out.print (secondNumber + " is larger");
        }




    }
}
