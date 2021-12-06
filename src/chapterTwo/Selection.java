package chapterTwo;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter first number");
        int a  =input.nextInt();

        System.out.print ("Enter second number");
        int b = input.nextInt ();


        if  (a ==b)
        {
            System.out.println ( " the numbers are equal to");
        }

        if (a > b)

        {
            System.out.println (a +  " is larger");
        }


        if (b > a)
        {
            System.out.print (b + " is larger");
        }




    }
}
