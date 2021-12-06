package chapterFour;

import java.util.Scanner;

public class DaysOfChristmas {
    public static void main(String[] args) {
        String days = """
                First day of Christmas  Press 1
                Second day of Christmas Press 2
                Third day of Christmas Press 3
                Fourth day of Christmas Press 4
                Fifth day of Christmas Press 5
                Sixth day of Christmas Press 6
                Seventh day of Christmas Press 7
                Eight day of Christmas Press 8
                Ninth day of Christmas Press 9
                Tenth day of Christmas Press 10
                Eleventh day of Christmas Press 11
                Twelfth day of Christmas Press 12
                """;
        System.out.println(days);
       Scanner input = new Scanner(System.in);
      int userInput = input.nextInt();
     switch (userInput) {
         case 1:
            System.out.println("On the first day of Christmas");
             System.out.println("My true love sent to me");
             System.out.println("A partridge in a pear tree");
             break;
         case 2:
             System.out.println("On the second day of Christmas");
             System.out.println("My true love sent to me");
             System.out.println("Two turtle doves and");
             System.out.println("Press 1");
             int secondDay = input.nextInt();
             switch (secondDay){
                 case 1:
                     System.out.println("A partridge in a pear tree");
             }
             break;
         case 3:
             System.out.println("On the Third day of Christmas");
             System.out.println("My true love sent to me");
             System.out.println("Three french hens");
             System.out.println("Press 1");
             int thirdDay = input.nextInt();
             switch (thirdDay){
                 case 1:
                     System.out.println("Two turtle doves and");
                     System.out.println("A partridge in a pear tree");

             }
             break;
         case 4:
             System.out.println("On the Fourth day of Christmas");
             System.out.println("My true love sent to me");
             System.out.println("Four colling birds ");
             System.out.println("Press 1");
             int fourthDay = input.nextInt();
             switch (fourthDay){
                 case 1:
                     System.out.println("Three french hens");
                     System.out.println("Two turtle doves and");
                     System.out.println("A partridge in a pear tree");

             }
             break;
         case 5:

    }

}
}
