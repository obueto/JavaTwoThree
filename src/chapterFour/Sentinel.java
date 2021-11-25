package chapterTwo;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {

        int total = 0;
        int score=0;
        do {               //do while loops
            total = total + score;
            System.out.println("Enter a score");
            Scanner input = new Scanner(System.in);
            score = input.nextInt();

        }
        while (score != -50);

        System.out.println("Total is " + total);
    }
}
/*
while (score > 0 && score < 101); while loop
total = total + score;
        System.out.println("Enter a score");
        Scanner input = new Scanner(System.in);
        score = input.nextInt();

        chapterTwo.Sentinel loop is determined by the user input then you fix a value for it to stop
        definite loop you the programmer does the counting
*/