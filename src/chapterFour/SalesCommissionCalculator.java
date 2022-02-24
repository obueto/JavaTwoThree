package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void calculateSalesPersonEarningForItem1(double item) {
        if (item == 1) {
            double item1 = 200 + 0.09 * 239.99;
            System.out.println(item1);}
              if (item == 2) {
                double item2 = 200 + 0.09 * 129.75;
                  System.out.println(item2);}
                if (item == 3){
                    double item3 = 200 + 0.09 * 99.95;
                    System.out.println(item3);}

                    if (item == 4){
                        double item4 = 200 + 0.09 * 350.89;
                        System.out.println(item4);
        }

    }



    public static void main(String[] args) {
        int userInput = 0;
        Scanner scanner = new Scanner(System.in);
        while (userInput != -1) {
            System.out.println("Enter the numbers of items sold from the four items");
            userInput = scanner.nextInt();
            calculateSalesPersonEarningForItem1(userInput);
        }


    }
}
