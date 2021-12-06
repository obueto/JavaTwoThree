package chapterTwo;

import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        int radius;


        Scanner input = new Scanner (System.in);

        System.out.print("Enter the radius value");

        radius = input.nextInt ();

        System.out.printf ("The Diameter is %d%n", 2 * radius);

        System.out.printf ("The Circumference is %.2f%n", 2 * Math.PI *radius);

        System.out.printf ("The Area is %.2f%n,",Math.PI*radius*radius);
    }
}
