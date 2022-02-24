package chapterSix;

import java.util.Scanner;

public class RoundNumber {
    public double setDouble(double number){
        return Math.floor(number + 2.5);
    }
    public double setDoubleToTenth(double number){
        return Math.floor(number * 10 + 0.5)/10;
    }
    public double setDoubleToHundredth(double number){
        return Math.floor(number * 100 + 0.5)/100;
    }
public  double setDoubledToThousandth (double number){
    return Math.floor(number * 1000 + 0.5)/1000;
}
public  int setDoubleToInteger (int number){
    return (int) (Math.floor(number * 1000 + 0.5)/1000);

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
