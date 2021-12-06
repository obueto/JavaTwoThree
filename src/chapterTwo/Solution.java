package chapterTwo;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int one;
        int two;


        System.out.println ("enter first value");

        one = input.nextInt ();

        System.out.println ("enter second value");

        two = input.nextInt ();

        System.out.printf ("sum is %d%n",one + two );
        System.out.printf ("product is %d%n", one * two);
        System.out.printf ("difference is %d%n",one - two );
        System.out.printf ("quotient is %d%n", one% two );
    }
}
