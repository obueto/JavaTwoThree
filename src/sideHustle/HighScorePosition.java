package sideHustle;

public class HighScorePosition {
    public static void main(String[] args) {

        checkNumber(-4);
        long miles = toMilesPerHour(10.5);
        System.out.println("miles is " + miles);


        int highScorePosition = calculateHighScorePosition(2000);
        displayHighScorePosition("Joey ", highScorePosition);

        highScorePosition = calculateHighScorePosition(450);
        displayHighScorePosition("Grace ", highScorePosition);
    }


    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position" + position + " " + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;

    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        }
        if (number < 0) {
            System.out.println("negative");
        }
        if (number == 0) {
            System.out.println("zero");
        }
    }

    public static long toMilesPerHour(double kiloMetersPerHour) {

        if (kiloMetersPerHour < 0) {
            return -1;
        }
        return  Math.round(kiloMetersPerHour / 1.609);


    }

    public static void PrintConversion (double kiloMeterPerHour){

        if(kiloMeterPerHour < 0){
            System.out.println("Invalid value");
        }
        else {
            long milesPerHour = toMilesPerHour(kiloMeterPerHour);
            System.out.println(kiloMeterPerHour  + "km/h ="  + milesPerHour +  "mi/hb ");
        }
    }
}






