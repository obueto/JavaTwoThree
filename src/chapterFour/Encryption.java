package chapterFour;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        int data = input.nextInt();

        int number;
        int number2;
        int number3;
        int number4;

        number = data/1000;
        number2 = (data%1000)/100;
        number3 = (data%100)/10;
        number4 = (data%10)/1;

        number = (number + 7)%10;
        number2 = (number2 + 7)%10;
        number3 =(number3 + 7)%10;
        number4 = (number4 + 7)%10;
//
//        int temporary;
//        temporary = number;
//        number = number3;
//        number3 = temporary;
//
//        temporary = number2;
//        number2 = number4;
//        number4 = temporary;



        System.out.printf("The encrypted data is %d%d%d%d",number3,number4,number,number2 );



    }
}
