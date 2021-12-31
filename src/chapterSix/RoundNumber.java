package chapterSix;

import java.util.Scanner;

public class RoundNumber {
    public double setDouble(double number){
        double num = Math.floor(number + 2.5);
        return num;
    }
    public double setDoubleToTenth(double number){
        double num = Math.floor(number * 10 + 0.5)/10;
        return num;
    }
    public double setDoubleToHundredth(double number){
        double num = Math.floor(number * 100 + 0.5)/100;
        return num;
    }
public  double setDoubledToThousandth (double number){
        double num = Math.floor(number * 1000 + 0.5)/1000;
        return num;
}
public  int setDoubleToInteger (int number){
        int num = (int) (Math.floor(number * 1000 + 0.5)/1000);
        return  num;

}
    public static void main(String[] args) {
        RoundNumber roundNumber = new RoundNumber();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        double roundNum = input.nextDouble();
        System.out.println("The round number is " + roundNumber.setDouble(roundNum));
        System.out.println(" " + roundNumber.setDoubleToTenth(roundNum));
        System.out.println(" " + roundNumber.setDoubleToHundredth(roundNum));
        System.out.println( " " + roundNumber.setDoubledToThousandth(roundNum));
        System.out.println(" " + roundNumber.setDoubleToInteger((int) roundNum));
    }
}
