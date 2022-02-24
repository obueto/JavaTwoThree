package chapterTwo;

import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String[] args) {
        int divide;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter a number   ");

        divide = input.nextInt();

        if (divide % 3 == 0) {
            System.out.println(divide + " is divisible by 3");
        }
        if ( divide % 3 != 0){
            System.out.println( divide + " is not divisible by 3");
        }
}
}
