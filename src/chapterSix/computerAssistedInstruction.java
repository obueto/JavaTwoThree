package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class computerAssistedInstruction {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        multiplicationQuiz();
    }

    public static void multiplicationQuiz(){
        SecureRandom secureRandom = new SecureRandom();
        int firstGuess = 1 +  secureRandom.nextInt(10);
        int secondGuess = 1 + secureRandom.nextInt(10);
        System.out.printf("How much is %d times %d\n",firstGuess,secondGuess);
        int result = firstGuess * secondGuess;

        int userInput = 0;

        while (userInput != result){
            userInput = scanner.nextInt();
            if (userInput == result) {
                int correctAnswer = secureRandom.nextInt(5);
                switch (correctAnswer) {
                    case 1 -> System.out.println("VeryGood!");
                    case 2 -> System.out.println("Excellent!");
                    case 3 -> System.out.println("Nice Work!");
                    case 4 -> System.out.println("Keep up the good work");
                }
                promptQuestion();
            }
            else {
                int notCorrectResponse = secureRandom.nextInt(5);
                        switch (notCorrectResponse) {
                            case 1 -> System.out.println("No,Please try again.");
                            case 2 -> System.out.println("Wrong, try once more");
                            case 3 -> System.out.println("Don't give up!");
                            case 4 -> System.out.println("No keep trying");
                        }
            }
        }

    }

    public static void promptQuestion(){
        System.out.println("Enter 1 to continue or 2 to quit");
        int userAnswer =scanner.nextInt();
        if (userAnswer == 1){
            multiplicationQuiz();
        }
        else {
            System.exit(0);
        }

    }

}


