package chapterFour;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the base of a triangle: " );
        int userInput = scanner.nextInt();

        for (int i = 0; i <= userInput ; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
