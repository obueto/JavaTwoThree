package chapterFour;

import java.util.Scanner;

public class CreatingComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        print("Enter a number");
        firstNumber = scanner.nextInt();
        print("Enter a number");
        secondNumber = scanner.nextInt();
        if (firstNumber == secondNumber){
            print("0");
        }
        else if (firstNumber > secondNumber){
            print("1");
        }
        else print("-1");

    }


    public static void print(String message){
        System.out.println(message);
    }

}