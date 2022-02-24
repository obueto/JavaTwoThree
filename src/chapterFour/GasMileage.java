package chapterFour;

import java.util.Scanner;

public class GasMileage {


   public static double calculateMilesPerGallon(int miles,int gallons){
double average = miles/gallons;
   return average;
}



    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
int userInputForMiles = 0;
        GasMileage gasMileage = new GasMileage();
        while (userInputForMiles != -1) {
            System.out.println("Enter the amount of miles not -1");
            userInputForMiles = input.nextInt();
            System.out.println("Enter the amount of gallons");
            int userInputForGallons = input.nextInt();
            double milesPerGallon = calculateMilesPerGallon(userInputForMiles, userInputForGallons);
            System.out.println("The miles per gallon is " + milesPerGallon);}
        }






    }

