package chapterTwo;

import java.util.Scanner;

public class BmiCalculator {


        public  static void main(String[] args){

            Scanner scanner = new Scanner (System.in);

            double bmi;
            System.out.println("Enter your weight in Kilogram");
             double weight = scanner.nextDouble();

            System.out.println ("Enter your height in meters");
           double height = scanner.nextDouble ();

            bmi = weight/ (height * height);

            System.out.println ("Your Body Mass Index is  ," + bmi);

        }


}
