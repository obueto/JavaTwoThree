package chapterTwo;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int numberThree;

        Scanner input = new Scanner (System.in);

        System.out.println("enter first number");
        numberOne = input.nextInt();

        System.out.println("enter second number");
        numberTwo = input.nextInt();

        System.out.println("enter third number");
        numberThree = input.nextInt();

        int product  =  numberOne* numberTwo* numberThree;
        int sum = numberOne + numberTwo + numberThree;
        int average = numberOne*numberTwo*numberThree/3;

        System.out.printf("sum is %d%n", sum);
        System.out.printf("average is %d%n", average);
        System.out.printf("product is %d%n", product);

        if (numberOne > numberTwo && numberOne >numberThree){
            System.out.printf("%d is the largest%n", numberOne);
        }



        if (numberTwo > numberOne && numberTwo >numberThree){
            System.out.printf("%d is the largest%n", numberTwo);
        }

        if (numberThree > numberOne && numberThree >numberTwo){
            System.out.printf("%d is the largest%n", numberThree);
            }

        if (numberOne < numberTwo && numberOne <numberThree){
            System.out.printf("The smallest is %d%n",numberOne);
        }

        if (numberTwo < numberOne && numberTwo <numberThree){
            System.out.printf("The smallest is %d%n",numberTwo);
        }



        if (numberThree <numberOne && numberThree <numberTwo){
            System.out.printf("The smallest is %d%n",numberThree);
        }







    }
}
