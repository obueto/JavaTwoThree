package chapterSix;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Year: ");
        int year = scan.nextInt();
        boolean result = isALeapYear(year);
        System.out.println(result);
    }

    public static boolean isALeapYear(int year){
        if (year < 0 || year > 9999 ){
            return false;
        }
        else {
            if (year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        return true;
                    }
                }
            }
        }
       if (year % 4 == 0){
           return year % 100 != 0;
       }
       return false;
    }
       //for (int counter = 1; counter <= 20;counter++){
//            int side = 1 + randomNumber.nextInt(6);
//            System.out.printf("%d ", side);
//            if (counter % 5 == 0) {
//                System.out.println();
//            }
//        }
}
