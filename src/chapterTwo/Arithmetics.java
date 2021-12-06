package chapterTwo;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        int one;
        int two;
        int three;

        Scanner input = new Scanner (System.in);

        System.out.println("enter first number");
        one = input.nextInt();

        System.out.println("enter second number");
        two = input.nextInt();

        System.out.println("enter third number");
        three = input.nextInt();

        int product  =  one* two* three;
        int sum = one + two + three;
        int average = one*two*three/3;

        System.out.printf("sum is %d%n", sum);
        System.out.printf("average is %d%n", average);
        System.out.printf("product is %d%n", product);

        if (one > two & one >three){
            System.out.printf("%d is the largest%n", one);
        }



        if (two > one & two >three){
            System.out.printf("%d is the largest%n", two);
        }

        if (three > one & three >two){
            System.out.printf("%d is the largest%n", three);
            }

        if (one < two & one <three){
            System.out.printf("The smallest is %d%n",one);
        }

        if (two < one & two <three){
            System.out.printf("The smallest is %d%n",two);
        }



        if (three <one & three <two){
            System.out.printf("The smallest is %d%n",three);
        }







    }
}
