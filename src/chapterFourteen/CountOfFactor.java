package chapterFourteen;

import java.util.Scanner;

public class CountOfFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        factorCount(userInput);
    }

    public static void factorCount(int number){
        int count = 1;
                for(int i = 0; i <= number;i++){
        if (number % count == 0 ){

            count++;
        }

    }
        System.out.println(count);
}
}
