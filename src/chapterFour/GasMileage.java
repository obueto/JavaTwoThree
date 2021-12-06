package chapterFour;

import java.util.Scanner;

public class GasMileage {
    private int miles;
    private int gallons;

    public void setGallons(int gallons) {
        this.gallons = gallons;


    }

    public void setMiles(int miles) {
        this.miles = miles;

    }

    public int getGallons() {

        return gallons;
    }

    public int getMiles() {

        return miles;
    }
    public  double calculateMilesAndGallon (){
        int average = getMiles() / getGallons();
        return average;
    }

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Enter -1 to stop: ");
        int sentinel = input.nextInt();
        GasMileage myMileageAccount = new GasMileage();
        while (sentinel != -1){
            sentinel = input.nextInt();
            System.out.println( "Enter the amount of miles used per trip");
            int miles= input.nextInt();
            myMileageAccount.setMiles(miles);
            System.out.println( "Enter the amount of gallons used per trip");
            int gallon = input.nextInt();
            myMileageAccount.setGallons(gallon);
            myMileageAccount.calculateMilesAndGallon();
            System.out.printf("The miles per gallon is %.2f%n",myMileageAccount.calculateMilesAndGallon());
        }




    }
}
