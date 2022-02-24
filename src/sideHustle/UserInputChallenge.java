package sideHustle;

import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            System.out.println("Enter number " + counter);

            boolean isValid = scanner.hasNextInt();
                if (isValid){
                    int userInput = scanner.nextInt();

counter++;
sum+=userInput;

        }
            else {
                System.out.println("Invalid number");
                scanner.next();
            }


    }
        System.out.println("The sum of the numbers entered are " + sum) ;
        scanner.close();
}
}
