package chapterTwo;

import java.util.Scanner;

public class Mutiples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scan.nextInt();

        System.out.println("Enter A Number: ");
        int secondNumber = scan.nextInt();

        if (num % secondNumber == 0){
            System.out.println("It is a mutiple");
        }
        else
            System.out.println("It is not a mutiple");
    }
}
