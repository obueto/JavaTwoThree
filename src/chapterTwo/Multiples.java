package chapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int firstNumber = scan.nextInt();

        System.out.println("Enter A Number: ");
        int secondNumber = scan.nextInt();

        if (firstNumber % secondNumber == 0){
            System.out.println("It is a multiple");
        }
        else
            System.out.println("It is not a multiple");
    }
}
