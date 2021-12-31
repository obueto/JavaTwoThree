package chapterSix;

import java.util.Scanner;

public class ParkingCharge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInput = 0 ;
        double total = 0;
        while (userInput != -1){
            System.out.println("Enter the number of hours: ");
             userInput  = scan.nextInt();
            double charge =  calculateCharge(userInput);
            System.out.printf("The charge for the customer is %.2f and the total receipt is %.2f\n",charge,total+=charge);
        }
    }
    public static double calculateCharge (int hours){
        double charges = 0;
        if (hours <= 3) {
            charges = 2;
            return charges;
        }
      else   if (hours > 3 && hours < 24) {
          charges = 2 +( (hours - 3) * 0.5);
          return charges;
        }
      else if (hours == 24){
            charges = 10;
            return charges;
        }

        return 0;
    }
}
