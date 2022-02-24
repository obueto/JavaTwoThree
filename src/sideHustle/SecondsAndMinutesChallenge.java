package sideHustle;

import java.util.Scanner;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three decimal number with spaces");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);
        System.out.println("Maximum is :" + result);
    }

    public static double maximum(double x, double y, double z) {
        double maxValue = x;
        if (y > maxValue) {
            maxValue = y;
        }
        if (z > maxValue) {
            maxValue = z;
        }

//    public String getDurationString(int minute, int second) {
//        if (minute >= 0) {
//            if (second >= 0 && second <= 59) {
//            }
//
//            return " ";
//        } else
//        return "Invalid value";

        return maxValue;
    }
}

